!function(t){var e="advads_procfp",a="advanced_ads_ad_clicks",n=null,i=null;function r(t){try{return JSON.parse(t)}catch(t){return null}}t(document).on("advads-passive-cb-conditions",(function(t,e){e.conditions.ad_clicks="check_ad_clicks",e.check_ad_clicks=function(t,e){if(advads.cookie_exists(a+"_"+e.id)){var n=advads.get_cookie(a+"_"+e.id);n=r(n)}if(n){var i=parseInt((new Date).getTime()/1e3);for(var o in n)if("_"+t.expiration==o&&n[o].ttl>=i&&n[o].count>=parseInt(t.limit))return!1}return!0}}));var o=function(){this.$elements={},this.currentIFrame=!1,this.focusLost=!1,this.wrappers=[".google-auto-placed"],this.attributes={"data-anchor-status":"displayed","data-vignette-loaded":"true"},this.lastClick=0,this.init()};o.prototype={constructor:o,init:function(){const e=this;let a;t(document).on("click","a[data-cfpa]",(function(){e.onClick(parseInt(t(this).attr("data-cfpa")))})),t(window).on("blur",(function(t){setTimeout((function(){if(!e.currentIFrame)for(let t=document.activeElement;t&&t!==this&&t!==document&&(e.currentIFrame=e.checkWrappers(t),!e.currentIFrame);t=t.parentNode);e.currentIFrame&&(e.onClick(e.currentIFrame),e.focusLost=!0,top.focus())}),0)})),t(document).on("mouseenter","div[data-cfpa]",(function(){var a=parseInt(t(this).attr("data-cfpa"));e.addElement(a)})),document.addEventListener("touchmove",(function(){a=!0}),!1),document.addEventListener("touchstart",(function(){a=!1}),!1),["click","touchend"].forEach((function(t){document.addEventListener(t,(function(t){if(a||e.getTimestamp()-e.lastClick<1)return;let n=null;for(let a=t.target;a&&a!==this&&a!==document;a=a.parentNode){if(n=e.checkWrappers(a),n){e.onClick(n);break}if(a.hasAttribute("data-cfpa")&&a.hasAttribute("data-cfptl")){n=parseInt(a.getAttribute("data-cfpa"),10),e.onClick(n);break}}}))}))},getTimestamp:function(){return Math.floor(Date.now()/1e3)},checkWrappers:function(t){for(let e=0,a=this.wrappers.length,n=null;e<a;e++)if(n=this.wrappers[e],t.matches&&t.matches(n))return".google-auto-placed"===n?"google-auto-placed":null;for(const[e,a]of Object.entries(this.attributes))if(t.hasAttribute(e)&&t.getAttribute(e)===a)return"google-auto-placed";return null},addElement:function(e){!1==e instanceof jQuery&&(e=t('div[data-cfpa="'+e+'"]').first());var o=!!e.find("iframe").length;if(o||e.find("a").length){var s=parseInt(e.attr("data-cfpa"));if(this.$elements[s]=e,e.removeAttr("data-cfpa"),o?(e.find("iframe").first().attr({"data-cfpa":s}),e.attr("data-cfph")&&e.find("iframe").first().attr({"data-cfph":e.attr("data-cfph")})):(e.find("a").not(".advads-edit-button").first().attr({"data-cfpa":s}),e.attr("data-cfph")&&e.find("a").not(".advads-edit-button").first().attr({"data-cfph":e.attr("data-cfph")})),e.removeAttr("data-cfph"),advads.cookie_exists(a+"_"+s)){var d=advads.get_cookie(a+"_"+s);if(d=r(d)){var c=parseInt((new Date).getTime()/1e3),f=!1;for(var u in d)if(d.hasOwnProperty(u)&&"exp"!=u&&d[u].ttl<c){for(var p=parseFloat(u.substr(1)),l=d[u].ttl;l<c;)l+=60*p*60;d[u].ttl=l,d[u].count=0,f=!0}if(f){var v=new Date(d.exp);advads.set_cookie_sec(a+"_"+s,JSON.stringify(d,"false",!1),parseInt(v.getTime()/1e3),n,i)}}}}},_banVisitor:function(){var t=new Date,e=new Date;e.setTime(e.getTime()+24*advadsCfpBan*60*60*1e3);var a=(e.getTime()-t.getTime())/1e3;advads.set_cookie_sec("advads_pro_cfp_ban",1,a,n,i),jQuery("[data-cfptl]").remove(),this.wrappers.forEach((function(t){jQuery(t).remove()}));for(const[t,e]of Object.entries(this.attributes))jQuery("["+t+'="'+e+'"]').remove()},onClick:function(o){var s=!1,d=!1;if(this.lastClick=this.getTimestamp(),"google-auto-placed"!==o&&t('[data-cfpa="'+o+'"]').attr("data-cfph"))if(advads.cookie_exists(a+"_"+o)&&(d=r(d=advads.get_cookie(a+"_"+o))),d){for(var c in d)if(d.hasOwnProperty(c)&&"exp"!=c){var f=parseInt(d[c].count);d[c].count=f+1}var u=new Date,p=new Date(d.exp),l=parseInt((p.getTime()-u.getTime())/1e3);advads.set_cookie_sec(a+"_"+o,JSON.stringify(d,"false",!1),l,n,i)}else{var v=t('[data-cfpa="'+o+'"]').attr("data-cfph").split("_"),m={},h=0,g=new Date;u=new Date;for(var c in v)parseFloat(v[c])>h&&(h=parseFloat(v[c])),m["_"+v[c]]={count:1,ttl:parseInt(u.getTime()/1e3+3600*parseFloat(v[c]))};g.setTime(g.getTime()+60*h*60*1e3);var _="expires="+g.toUTCString();l=parseInt((g.getTime()-u.getTime())/1e3);m.exp=_,advads.set_cookie_sec(a+"_"+o,JSON.stringify(m,"false",!1),l,n,i)}if(advads.cookie_exists(e+"_"+o)&&(s=r(s=advads.get_cookie(e+"_"+o))),s){f=parseInt(s.count);s.count=f+1;u=new Date,l=((p=new Date(s.exp)).getTime()-u.getTime())/1e3;advads.set_cookie_sec(e+"_"+o,JSON.stringify(s,"false",!1),l,n,i),advadsCfpClickLimit<=s.count&&"undefined"!=typeof advadsCfpBan&&this._banVisitor()}else{g=new Date,u=new Date;g.setTime(g.getTime()+60*advadsCfpExpHours*60*1e3);_="expires="+g.toUTCString(),l=(g.getTime()-u.getTime())/1e3;advads.set_cookie_sec(e+"_"+o,'{"count":1,"exp":"'+_+'"}',l,n,i),1===advadsCfpClickLimit&&"undefined"!=typeof advadsCfpBan&&this._banVisitor()}}},t((function(){for(var e in window.advadsProCfp=new o,t(document).on("mouseenter","iframe[data-cfpa]",(function(e){var a=parseInt(t(this).attr("data-cfpa"));advadsProCfp.currentIFrame=a})).on("mouseenter",".google-auto-placed",(function(t){advadsProCfp.currentIFrame="google-auto-placed"})).on("mouseleave mouseout","[data-cfpa], .google-auto-placed",(function(){advadsProCfp.currentIFrame=!1,advadsProCfp.focusLost&&(advadsProCfp.focusLost=!1,t(window).trigger("focus"))})),advadsCfpQueue)advadsCfpQueue.hasOwnProperty(e)&&advadsProCfp.addElement(advadsCfpQueue[e]);advadsCfpQueue=[],void 0!==window.advadsCfpPath&&(""!=advadsCfpPath&&(n=advadsCfpPath),""!=advadsCfpDomain&&(i=advadsCfpDomain))}))}(window.jQuery)