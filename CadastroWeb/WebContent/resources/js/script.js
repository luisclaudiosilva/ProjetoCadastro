//Mascara IP    //
function maskIP(e,obj){
		
        if (document.all){
        	var evt=event.keyCode;
        	} // caso seja IE
        else
        {
        	var evt = e.charCode;
        	}    // do contrário...
        if (evt <20) 
        	return true;    // liberando teclas de controle
        if ( (/^(\d{1,3}\.){3}\d{3}$/).test(obj.value) ) 
        	return false;        
        var chr= String.fromCharCode(evt);    // pegando a tecla digitada
        if (! (/[\d\.]/).test(chr)) 
        	return false; // testando se é uma tecla válida (um digito ou um ponto)
       	 
        if (chr=='.')
            return (!(/\.$|^(\d{1,3}\.){3}/).test(obj.value) );
        else 
            if( (/\d{3}$/).test(obj.value) )
                obj.value+='.';  
        return true;
    }
    // /Mascara IP    //

    // Valida IP    //    
//function validateIP(ip,showErrMsg){
//a = (/\b(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\b/).test(ip);
//if (!a && showErrMsg){
//}
//return a;
//}

function validateIP(id){
    var RegExPattern = /^((25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]|[0-9])\.){3}(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]|[0-9])$/;
    //if(id=="*"||"**"||"***"||"****"||"*****"||"******"||"*******"||"********"||"*********"||"**********"||"***********"||"************"||"*************"||"**************"||"***************")
    //{
    	//return id;
    //}
  
   if( (!(id.value.match(RegExPattern)) && (id.value!= "*") && (id.value!= "**") && (id.value!= "***") && (id.value!= "****")  && (id.value!= "*****") && (id.value!= "******") && (id.value!= "*******") && (id.value!= "********") && (id.value!= "*********") && (id.value!= "**********") && (id.value!= "***********") && (id.value!= "************") && (id.value!= "*************") && (id.value!= "**************") && (id.value!= "***************")) || id.value=='0.0.0.0' || id.value=='255.255.255.255') 

    {
       alert("IP invalido!");
       id.value = "";
       id.focus();
       id.style.backgroundColor="#FF9999";
    }
     
}

function verificaString(){
    	windows.alert("O campo não foi preenchido!");
    }

function cancAcento(){
	if (event.keyCode == 219 || event.keyCode == 222){
	event.keyCode = 0
	event.returnValue = false
	}
}
  

function startDownload(){
var url="D:\\novo.txt";  
window.open(url,"Download");
}

function SaveToDisk(fileURL, fileName) {  
    // for non-IE
    if (!window.ActiveXObject) {
        var save = document.createElement('a');
        save.href = fileURL;
        save.target = '_blank';
        save.download = fileName || 'unknown';

        var event = document.createEvent('Event');
        event.initEvent('click', true, true);
        save.dispatchEvent(event);
        (window.URL || window.webkitURL).revokeObjectURL(save.href);
    }

    // for IE
    else if ( !! window.ActiveXObject && document.execCommand)     {
        var _window = window.open(fileURL, '_blank');
        _window.document.close();
        _window.document.execCommand('SaveAs', true, fileName || fileURL)
        _window.close();
    }
}

function abrirPopup(url,w,h) {
	var newW = w + 100;
	var newH = h + 100;
	var left = (screen.width-newW)/2;
	var top = (screen.height-newH)/2;
	var newwindow = window.open(url, 'name', 'width='+newW+',height='+newH+',left='+left+',top='+top);
	newwindow.resizeTo(newW, newH);
	 
	//posiciona o popup no centro da tela
	newwindow.moveTo(left, top);
	newwindow.focus();
	return false;
	}

function SomenteNumero(e){
    var tecla=(window.event)?event.keyCode:e.which;   
    if((tecla>47 && tecla<58) || (tecla>95 && tecla<106))return true;
    else{
    if (tecla==8 || tecla==0 || tecla==42 || tecla==106 || tecla==190 || tecla==108) return true;
    	 
	else  return false;
    	
    }
}

function SomenteNumero2(e){
    var tecla=(window.event)?event.keyCode:e.which;   
    if((tecla>47 && tecla<58) || (tecla>95 && tecla<106))
    	
    	return true;
    
    else{
    	if (tecla==8 || tecla==0) return true;
    	 
	else  return false;
    	
    }
}


function validaZero(id){
	  variavel = document.getElementById("form:porta").value; 
	   
	    if(variavel == 0){ 
	    	alert("Valor inválido!");
	    	document.getElementById("form:porta").value="";
	    	document.getElementById("form:porta").style.backgroundColor="#FF9999";
	    	document.getElementById("form:porta").focus();
	    }
}
	    
	    
function validaZero2(id){
	valor1();
	
	variavel = document.getElementById("form:prioridade").value; 
	  	   
	if(variavel == 0){ 
		alert("Valor inválido!");
	  	document.getElementById("form:prioridade").value="";
	  	document.getElementById("form:prioridade").style.backgroundColor="#FF9999";
	  	document.getElementById("form:prioridade").focus();
	  }
}


function validaPorta(id){
    variavel = document.getElementById("form:portaInicial").value; 
    variavel2 = document.getElementById("form:portaFinal").value;
    
    if(parseInt(variavel) >= parseInt(variavel2)){ 
    	alert("Porta Final deve ser maior que Porta Inicial!");
    	document.getElementById("form:portaFinal").value="";
    	document.getElementById("form:portaFinal").style.backgroundColor="#FF9999";
    	document.getElementById("form:portaFinal").focus();
    }
}

function ativaPorta(id){    
    if(document.getElementById("form:portaInicial").value == ""){ 
    alert("Porta Inicial sem valor!");
	document.getElementById("form:portaFinal").value = "";	
	document.getElementById("form:portaFinal").style.backgroundColor="#FF9999";
    }
    else
    {
    	if(!(document.getElementById("form:portaInicial").value >= 1)){ 
    		alert("Porta Inicial com valor inválido!");
    		document.getElementById("form:portaFinal").value="";
    		document.getElementById("form:portaFinal").style.backgroundColor="#FF9999";
    		document.getElementById("form:portaFinal").focus();
    	}
    }   
}
/*

function enviardados(form){
	 
	if(document.meuform.dados.value=="" || document.meuform.dados.value.length < 8){
	alert( "Preencha campo DADOS corretamente!" );
	document.dados.tx_nome.focus();
	return false;
	}
}
*/
/*
function validaPri(id){
    variavel = document.getElementById("form:prioridadeAntiga").value; 
    variavel2 = document.getElementById("form:prioridadeNova").value;
    variavel3 = 0;
    
    if((variavel) != (variavel2)){ 
    	
        variavel3 = variavel;
        variavel = variavel2;
        variavel2 = variavel3; 
    	
    	alert("Prioridade antiga - "+variavel+" Prioridade Nova - "+variavel2);
    	document.getElementById("form:portaFinal").value="";
    
    }
}
*/
function valor1() {
	variavel = document.getElementById("form:prioridadeAntiga").value; 
    return variavel;
};

function valor2() {
	variavel2 = document.getElementById("form:prioridadeNova").value;
    return variavel2;
};












