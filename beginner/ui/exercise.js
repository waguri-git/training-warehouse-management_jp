/* 
 * TODO: addEventListenerを使って、ボタンを押さなくても
 * DOM読み込み後に、fetchMenus()が呼び出されるようにする
 */

async function fetchMenus() {
    const menus = await fetch("http://localhost:8080/menus");
    if (!menus.ok) {
        throw new Error("Could not fetch menus");
    }
    const menusJson = await menus.json();
    console.log(menusJson);
    renderMenus(menusJson);
}

function renderMenus(menusJson) {
    const menus = document.getElementById("menu-list");
    if (!menus) {
        throw new Error("Could not find orders element");
    }
    menus.innerHTML = "";
    const menuTable = document.createElement("table");
    menuTable.innerHTML = "<th>Menu ID</th><th>Menu Name</th>";
    menusJson.menus.forEach((menu) => {
        menuTable.innerHTML += `
        <tr>
            <td>${menu.id}</td>
            <td>${menu.name}</td>
            <td>
            <button onclick="renderMenu(${menu.id})">Edit</button>
            </td>
        </tr>
        `;
        menus.appendChild(menuTable);
    });
}

async function handleRegisterMenu(event) {
    event.preventDefault();
    const form = event.target.form;
    const formData = new FormData(form);
    const menu = {
        name: formData.get("name"),
    };
    
    const response = await fetch("http://localhost:8080/menus", {
        method: "POST",
        headers: {
            "Content-Type": "application/json",
        },
        body: JSON.stringify(menu),
    });
    if (!response.ok) {
        const error = await response.json();
        console.error(error);
        return;
    }

    fetchMenus();
}

async function fetchMenu(id) {
    const response = await fetch(`http://localhost:8080/menus/${id}`);
    if (!response.ok) {
        throw new Error("Could not fetch menu");
    }
    return await response.json();
}

async function renderMenu(id) {
    const menu = await fetchMenu(id);
    const orderDiv = document.getElementById("menu-modal-component");
    orderDiv.innerHTML = `
    <form>
        <div> order id: ${menu.id}</div>
        <label for="itemId">Item ID</label>
        <input type="text" name="name" value="${menu.name}"/>
        <label for="amount">Amount</label>
        <button type="submit" onclick="handleUpdateOrder(event, ${menu.id})">Update</button>
    </form>
    `;
    document.getElementById("myMenu").style.display = "block";
}


async function handleUpdateMenu(event, id) {
    event.preventDefault();
    //TODO: handleUpdateOrderを参考に完成させる
}

