!function(){"use strict";if("querySelector"in document&&"addEventListener"in window){var r=document.body,t=function(e,t){e.preventDefault(),e.stopPropagation();var n=(t=t||this).closest("li"),o=t.closest("nav").querySelectorAll("ul.toggled-on");if(o&&!t.closest("ul").classList.contains("toggled-on")&&!t.closest("li").classList.contains("sfHover"))for(var l=0;l<o.length;l++)o[l].classList.remove("toggled-on"),o[l].closest("li").classList.remove("sfHover");n.classList.toggle("sfHover");e=n.querySelector(".dropdown-menu-toggle");"false"!==e.getAttribute("aria-expanded")&&e.getAttribute("aria-expanded")?e.setAttribute("aria-expanded","false"):e.setAttribute("aria-expanded","true"),e=n.querySelector(".sub-menu")?".sub-menu":".children",r.classList.contains("dropdown-click-menu-item")?t.parentNode.querySelector(e).classList.toggle("toggled-on"):r.classList.contains("dropdown-click-arrow")&&n.querySelector(e).classList.toggle("toggled-on")},e=document.querySelectorAll(".main-nav .menu-item-has-children > a");if(r.classList.contains("dropdown-click-menu-item"))for(o=0;o<e.length;o++)e[o].addEventListener("click",t,!0);if(r.classList.contains("dropdown-click-arrow")){for(o=0;o<document.querySelectorAll(".main-nav .menu-item-has-children > a").length;o++)"#"===document.querySelectorAll(".main-nav .menu-item-has-children > a")[o].getAttribute("href")&&document.querySelectorAll(".main-nav .menu-item-has-children > a")[o].classList.add("menu-item-dropdown-click");for(var n=document.querySelectorAll(".main-nav .menu-item-has-children > a .dropdown-menu-toggle"),o=0;o<n.length;o++)n[o].addEventListener("click",t,!1),n[o].addEventListener("keydown",function(e){"Enter"===e.key&&t(e,this)},!1);for(o=0;o<document.querySelectorAll(".main-nav .menu-item-has-children > a.menu-item-dropdown-click").length;o++)document.querySelectorAll(".main-nav .menu-item-has-children > a.menu-item-dropdown-click")[o].addEventListener("click",t,!1)}var l=function(){if(document.querySelector("nav ul .toggled-on")){var e=document.querySelectorAll("nav ul .toggled-on"),t=document.querySelectorAll("nav .dropdown-menu-toggle");for(o=0;o<e.length;o++)e[o].classList.remove("toggled-on"),e[o].closest(".sfHover").classList.remove("sfHover");for(o=0;o<t.length;o++)t[o].setAttribute("aria-expanded","false")}};document.addEventListener("click",function(e){e.target.closest(".sfHover")||l()},!1),document.addEventListener("keydown",function(e){"Escape"===e.key&&l()},!1)}}();