<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	import="it.iftsrizzoli.gestionestudenti.model.domain.Studente,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>VISUALIZZAZIONE DATI UTENTE</title>
<link rel="stylesheet" href="css/layout.css">
</head>
<body>
	<%
		ArrayList<Studente> studenti = (ArrayList<Studente>) request.getSession().getAttribute("studenti");
		for (Studente us : studenti) {
			System.out.println(us.toString());
		}
	%>
	<table>
		<tr>
			<th>Id</th>
			<th>Nome</th>
			<th>Cognome</th>
		</tr>
		<%
			for (int i = 0; i < studenti.size(); i++) {
				Studente s = (Studente) studenti.get(i);
		%>
		<tr>
			<td><%=s.getId()%></td>
			<td><%=s.getNome()%></td>
			<td><%=s.getCognome()%></td>
		</tr>
		<%
			}
		%>

	</table>

	<div>
		<a class="navigate" href="./creaStudente.html">Torna alla pagina
			di inserimento</a>
	</div>
	<div>
		<a class="navigateOut" href="Logout.jsp">Logout</a>
	</div>
</body>
</html>