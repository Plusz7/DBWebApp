<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" href="https://unpkg.com/@coreui/coreui/dist/css/coreui.min.css">
    <script src="http://code.jquery.com/jquery-3.3.1.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
    <script src="https://unpkg.com/@coreui/coreui/dist/js/coreui.min.js"></script>
    <meta charset="UTF-8">
    <title>Add new plant ;p</title>
</head>
<body>

<form:form method="post" modelAttribute="plantFiltered">
    Nazwa : <br>
    <form:input path="name" /><br>
    Grupa : <br>
    <c:forEach items="${grupaenum}" var = "gr">
        <form:radiobutton label="${gr}" path="grupa" items="${gr}" value="${gr}"/><br>
    </c:forEach><br>
    Pokroj : <br>
    <c:forEach items="${pokrojenum}" var = "pok">
        <form:checkbox label="${pok.getNazwa()}" path="pokroj" items="${pok}" value="${pok}"/><br>
    </c:forEach><br>
    Wysokosc : <br>
    <c:forEach items="${wysokoscenum}" var="wys">
        <form:checkbox label="${wys.getWys()}" path="wysokosc" items="${wys}" value="${wys}"/><br>
    </c:forEach><br>
    Zimozielone : <br>
    <c:forEach items="${zimozieloneenum}" var = "zz">
        <form:radiobutton label="${zz}" path="zimozielone" items="${zz}" value="${zz}"/><br>
    </c:forEach><br>
    Kolor Lisci : <br>
    <c:forEach items="${kolorliscienum}" var = "kl">
        <form:checkbox label="${kl}" path="kolorLisci" items="${kl}" value="${kl}"/><br>
    </c:forEach><br>
    Sila Wzrostu : <br>
    <c:forEach items="${silawzrostuenum}" var = "sw">
        <form:radiobutton label="${sw}" path="silaWzrostu" items="${sw}" value="${sw}"/><br>
    </c:forEach><br>
    Pora Kwitnienia : <br>
    <c:forEach items="${porakwitnieniaenum}" var = "pk">
        <form:checkbox label="${pk.getMiesiacKwitnienia()}" path="poraKwitnienia" items="${pk}" value="${pk}"/><br>
    </c:forEach><br>
    Kolor Kwiatow : <br>
    <c:forEach items="${kolorkwiatowenum}" var = "kk">
        <form:checkbox label="${kk.getKolor()}" path="kolorKwiatow" items="${kk}" value="${kk}"/><br>
    </c:forEach><br>
    Naslonecznienie : <br>
    <c:forEach items="${naslonecznienieenum}" var = "nas">
        <form:checkbox label="${nas.getSwiatlo()}" path="naslonecznienie" items="${nas}" value="${nas}"/><br>
    </c:forEach><br>
    Stanowisko : <br>
    <c:forEach items="${stanowiskoenum}" var = "sta">
        <form:checkbox label="${sta.getKierunek()}" path="stanowisko" items="${sta}" value="${sta}"/><br>
    </c:forEach><br>
    Wilgotnosc : <br>
    <c:forEach items="${wilgotnoscenum}" var = "wil">
        <form:checkbox label="${wil.getWilgoc()}" path="wilgotnosc" items="${wil}" value="${wil}"/><br>
    </c:forEach><br>
    Ph Podloza : <br>
    <c:forEach items="${phpodlozaenum}" var = "ph">
        <form:checkbox label="${ph.getPoziom()}" path="phPodloza" items="${ph}" value="${ph}"/><br>
    </c:forEach><br>
    Rodzaj Gleby : <br>
    <c:forEach items="${rodzajglebyenum}" var = "rg">
        <form:checkbox label="${rg.getGleba()}" path="rodzajGleby" items="${rg}" value="${rg}"/><br>
    </c:forEach><br>
    Strefa Klimatyczna : <br>
    <form:select path="strefyKlimatyczne" items="${strefyklimatyczne}"> ></form:select><br><br>
    Walory : <br>
    <c:forEach items="${waloryenum}" var = "wal">
        <form:checkbox label="${wal.getWalor()}" path="walory" items="${wal}" value="${wal}"/><br>
    </c:forEach><br>
    Zastosowanie : <br>
    <c:forEach items="${zastosowanieenum}" var = "zas">
        <form:checkbox label="${zas.getCel()}" path="zastosowanie" items="${zas}" value="${zas}"/><br>
    </c:forEach><br>
    Owoce : <br>
    <c:forEach items="${owoceenum}" var = "owo">
        <form:checkbox label="${owo.getRodzaj()}" path="owoce" items="${owo}" value="${owo}"/><br>
    </c:forEach><br>
    Pora Owocowania : <br>
    <c:forEach items="${poraowocowaniaenum}" var = "po">
        <form:checkbox label="${po.getMiesiacOwocowania()}" path="poraOwocowania" items="${po}" value="${po}"/><br>
    </c:forEach><br>






    <input type="submit" value="Szukaj"><br>
</form:form>

</body>
</html>