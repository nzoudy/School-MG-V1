<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>

<div id="formEtudiant">
	<f:form modelAttribute="etudiant" action="saveEtudiant" method="post">
		<table>
			<tr>
				<td>ID Etudiant</td>
				<td><f:input path="idEtudiant"/></td>
				<td><f:errors path="idEtudiant" cssClass="errors"></f:errors></td> 
			</tr>
			<tr>
				<td>Nom</td>
				<td><f:input path="nomEtudiant"/></td>
				<td><f:errors path="nomEtudiant" cssClass="errors"></f:errors></td> 
			</tr>
			<tr>
				<td>Prenom</td>
				<td><f:input path="prenom"/></td>
				<td><f:errors path="prenom" cssClass="errors"></f:errors></td> 
			</tr>
			<tr>
				<td><input type="submit" value="Save"/></td>
			</tr>
		</table>
	</f:form>
</div>

<div id="">
	<table>
		<tr>
			<th>ID Etudiant</th><th>Nom</th><th>Prenom</th>
			<c:forEach items="${etudiants}" var="e">
				<tr>
					<td>${e.idEtudiant}</td>
					<td>${e.nomEtudiant}</td>
					<td>${e.prenom}</td>
				</tr>
			</c:forEach>
		</tr>
	</table>
</div>