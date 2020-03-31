<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="it-IT">
    <head>
        <title>Lista Studenti - Chiamata Ajax da JQuery</title>
        <link rel="stylesheet" href="css/layout.css">
        <script src="http://code.jquery.com/jquery-latest.min.js"></script>
        <script src="js/listaStudenti.js"></script>
    </head>
    <body>
        <button id="button">Clicca qui per visualizzare la lista</button>
        <div id="listaStudentiDiv"></div>
        <div>
		<a class="navigateIn" href="./creaStudente.html">Torna alla pagina
			di inserimento</a>
	</div>
	<div>
		<a class="navigateOut" href="Logout.jsp">Logout</a>
	</div>
    </body>
</html>