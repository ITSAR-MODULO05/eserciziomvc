<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="it.iftsrizzoli.gestionestudenti.model.domain.Studente"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>VISUALIZZAZIONE DATI UTENTE</title>
<link rel="stylesheet" href="css/layout.css">
</head>
<body>
	<%
		Studente studente = (Studente) request.getAttribute("studente");
	%>
	<div>
		<p>Errore nell'inserimento dei dati relativi a:</p>
	</div>
	<div>
		<p>
			Nome:
			<%
			String nome = studente.getNome();
			out.println(nome);
		%><br> Cognome:
			<%
			String cognome = studente.getCognome();
			out.println(cognome);
		%>
		</p>
	</div>
	<div>
		<a class="navigateIn" href="./creaUtente.html">Torna alla pagina di inserimento</a>
	</div>
</body>
</html>