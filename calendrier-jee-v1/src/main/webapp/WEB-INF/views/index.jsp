<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<head>
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/resources/css/commons-style.css" />
</head>
	<title>Home Page</title>
</head>

<body >
	<div class="errors">${exception}</div>
	<div id="content-index">
		<div class="main-entry">
			<img class="main-entry-ingesup" alt="" src="<%=request.getContextPath()%>/resources/images/main-entry.png">
			<span> Le cursus d’Ingésup est conçu comme un programme
				continu qui se déroule en 5 ans pour les bacheliers ayant intégré le
				cycle Bachelor <br>ou en 2 ans pour les étudiants ayant opté pour une
				admission directe en 1ère année du cycle Expert. <br>Chaque année, les
				étudiants peuvent réellement constater leurs avancées vers leur
				futur rôle d’expert dans l’entreprise <br></span>
		</div>
	
		<div class="other">
			<img class="other-ingesup" alt="" src="<%=request.getContextPath()%>/resources/images/other.png">
		</div>
		
		<div>
			<a href="<c:url value='/admin/etudiants' />">Connect as Admin</a> <br><br>
			<a href="<c:url value='/planningEtudiant/displayEtudiant' />">Go to Student's Planning</a>
		</div>
		
	</div>
</body>
</html>