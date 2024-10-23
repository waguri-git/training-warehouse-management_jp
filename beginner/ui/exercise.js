async function fetchMenus() { //エンドポイントに繋がっている　同じくエンドポイントに繋がっているジャバとつながる　サーバー側がエンドポイント（menus）を設置する
    const menus = await fetch("http://localhost:8080/menus");
    if (!menus.ok) {
        throw new Error("Could not fetch menus");
    }
    const menusJson = await menus.json();
    console.log(menusJson);
    renderMenus(menusJson);
}

function renderMenus(menusJson) {　//自分で書く
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
        </tr>
        `;
        menus.appendChild(menuTable);
    });
}

async function handRegisterMwnu(event) {
    event.preventDefauld();
    const form = event.target.form;
    const formDate = new FormDate(form);
    const menu = {
        name: formDate.get("name"),
        };
       
const response =await fetch("http://localhost:8080/menus",{
    method: "POST",
    headers:{
        "Content-Type": "application/json",
    },
    body: JSON.stringify(menu)
});
    
}