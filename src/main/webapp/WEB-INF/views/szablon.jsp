<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<h1><spring:message code="app.title"/></h1>
<h3><spring:message code="hello.message" argument="${person.firstName}"/></h3>