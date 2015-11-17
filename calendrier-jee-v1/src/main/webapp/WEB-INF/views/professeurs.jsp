<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>

<div id="formProfesseur">
	<f:form modelAttribute="professeur" action="saveProfesseur" method="post">
		<table>
			<tr>
				<td>Nom Professeur</td>
				<td><f:input path="professeurName"/></td>
				<td><f:errors path="professeurName" cssClass="errors"></f:errors></td>
			</tr>
			<tr>
				<td>Prenom Professeur</td>
				<td><f:input path="professeurSurname"/></td>
				<td><f:errors path="professeurSurname" cssClass="errors"></f:errors></td>
			</tr>
			<tr>
				<td><input type="submit" value="Enregistrer"/></td>
			</tr>
		</table>
	</f:form>
</div>
<div>
	<table>
		<tr>
			<c:forEach items="${professeurs}" var="prof">
				<tr>
					<td>${prof.professeurName}</td>
					<td>${prof.professeurSurname}</td>
				</tr>
			</c:forEach>
		</tr>
	</table>
</div>