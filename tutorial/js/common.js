function setIndex() {
  const index = [
    { title: "Home", url: "../index.html" },
    { title: "Programming", url: "./programming.html" },
    { title: "Controller paramter", url: "./controller-parameter.html" },
    { title: "CRUD", url: "./crud.html" },
    { title: "Javascript", url: "" },
    { title: "JSTL", url: "" },
    { title: "iBatis", url: "" },
    { title: "SQL", url: "" },
    { title: "자료모음", url: "" }
  ];

  const contentEl = '<div id="header-container">';

  let indexHtml = index.reduce(function(html, item) {
    html += `<p><a href="${item.url}">${item.title}</a></p>`;
    return html;
  }, contentEl);

  $("#content").prepend(indexHtml + "</div>");
}
