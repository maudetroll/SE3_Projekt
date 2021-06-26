
function basisBereitsstellen(name){
	let array= [document.getElementById(name), document.createElement("ul"), document.createElement("button")]
	return array;
}

async function zeigeLandEintrage(){

	let response= await fetch("http://localhost:8080/Herkunftslaender");
	let entries= await response.json();
	console.log (entries);

	entries._embedded.Herkunftslaender.forEach(zeigeLandAn);
}

function zeigeLandAn(eintraege){
	aufbau= basisBereitsstellen("entries");

	aufbau[2].innerHTML= "Zeige Liste";
	aufbau[2].addEventListener("click", function(e){
		zeigeHerstellerEintrage(eintraege._links.hersteller.href, aufbau[1]);
	});
	aufbau[1].innerHTML += `<li><b>${eintraege.name}:</b> ${eintraege.einwohnerzahl}</li>`;
	aufbau[0].appendChild(aufbau[1]);
	aufbau[1].appendChild(aufbau[2]);
}

async function zeigeHerstellerEintrage(HerstellerVonLand){

	let response= await fetch("http://localhost:8080/MobiltelefonHersteller");
	let entries= await response.json();
	
	if(HerstellerVonLand !=null){
		response= await fetch (HerstellerVonLand);
		entries= await response.json();
	}

	entries._embedded.MobiltelefonHersteller.forEach(zeigeHerstellerAn);
}

function zeigeHerstellerAn(eintraege){
	aufbau= basisBereitsstellen("entriesHersteller");

	aufbau[2].innerHTML= "Zeige Liste";
	aufbau[2].addEventListener("click", function(e){
		zeigeModellEintraege(eintraege._links.modelle.href, aufbau[1]);
	});
	aufbau[1].innerHTML += `<li> Name: <b>  ${eintraege.name}:</b> Mitarbeiter: ${eintraege.mitarbeiteranzahl}</li>`
	aufbau[0].appendChild(aufbau[1]);
	aufbau[1].appendChild(aufbau[2]);
}

async function zeigeModellEintraege(ModellvonLand){

	let response= await fetch("http://localhost:8080/Modelle");
	let entries= await response.json();

	console.log(ModellvonLand)
	if(ModellvonLand !=null){
		response= await fetch (ModellvonLand);
		entries= await response.json();
	}
	
	entries._embedded.Modelle.forEach(zeigeModelleAn);
}


function zeigeModelleAn(eintraege){
	aufbau= basisBereitsstellen("entriesModelle");
	aufbau[2].disabled = true;
	aufbau[2].innerHTML= "Zeige Liste";
	aufbau[2].addEventListener("click", function(e){
		zeigeHerstellerEintrage(eintraege._links.hersteller.href, aufbau[1]);
	});
	aufbau[1].innerHTML += `<li> Modellname: <b>${eintraege.modellName}:</b> CPU: ${eintraege.prozessorName}</li>`;
	aufbau[0].appendChild(aufbau[1]);

}

function reset(){
	location.reload();
}