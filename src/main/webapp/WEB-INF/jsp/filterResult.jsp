<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Plants</title>
    <style>
        table, th, td {
            border: 1px solid black;
        }
    </style>
</head>
<body>
<table>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Grupa</th>
        <th>Pokroj</th>
        <th>Wysokosc</th>
        <th>Zimozielone</th>
        <th>Kolor Lisci</th>
        <th>Sila Wzrostu</th>
        <th>Pora Kwitnienia</th>
        <th>Kolor Kwiatow</th>
        <th>Naslonecznienie</th>
        <th>Stanowisko</th>
        <th>Wilgotnosc</th>
        <th>Ph Podloza</th>
        <th>Rodzaj Gleby</th>
        <th>Strefa Klimatyczna</th>
        <th>Walory</th>
        <th>Zastosowanie</th>
        <th>Owoce</th>
        <th>Pora Owocowania</th>
        <th>Opcje</th>
    </tr>

    <c:forEach items="${listOfPlants}" var = "plant">

        <tr>
            <td>${plant.getId()}</td>
            <td>${plant.getName()}</td>
            <td>${plant.getGrupa()}</td>
            <td>
                <c:forEach items="${plant.getPokroj()}" var = "p">
                    ${p.getNazwa()}<br>
                </c:forEach>
            </td>
            <td>
                <c:forEach items="${plant.getWysokosc()}" var = "wysokosc">
                    ${wysokosc.getWys()}<br>
                </c:forEach>
            </td>
            <td>${plant.getZimozielone()}</td>
            <td>${plant.getKolorLisci()}</td>
            <td>${plant.getSilaWzrostu()}</td>
            <td>
                <c:forEach items="${plant.getPoraKwitnienia()}" var = "pk">
                ${pk.getMiesiacKwitnienia()}<br>
            </c:forEach>
            </td>
            <td><c:forEach items="${plant.getKolorKwiatow()}" var = "kk">
                ${kk.getKolor()}<br>
            </c:forEach></td>
            <td><c:forEach items="${plant.getNaslonecznienie()}" var = "n">
                ${n.getSwiatlo()}<br>
            </c:forEach></td>
            <td><c:forEach items="${plant.getStanowisko()}" var = "s">
                ${s.getKierunek()}<br>
            </c:forEach></td>
            <td><c:forEach items="${plant.getWilgotnosc()}" var = "w">
                ${w.getWilgoc()}<br>
            </c:forEach></td>
            <td><c:forEach items="${plant.getPhPodloza()}" var = "pk">
                ${pk.getPoziom()}<br>
            </c:forEach></td>
            <td><c:forEach items="${plant.getRodzajGleby()}" var = "pk">
                ${pk.getGleba()}<br>
            </c:forEach></td>
            <td>${plant.getStrefyKlimatyczne()}</td>
            <td><c:forEach items="${plant.getWalory()}" var = "pk">
                ${pk.getWalor()}<br>
            </c:forEach></td>
            <td><c:forEach items="${plant.getZastosowanie()}" var = "pk">
                ${pk.getCel()}<br>
            </c:forEach></td>
            <td><c:forEach items="${plant.getOwoce()}" var = "pk">
                ${pk.getRodzaj()}<br>
            </c:forEach></td>
            <td><c:forEach items="${plant.getPoraOwocowania()}" var = "pk">
                ${pk.getMiesiacOwocowania()}<br>
            </c:forEach></td>
            <td><a href = "">Edit</a>
                <a href = "/plant/${plant.getId()}/delete">Delete</a></td>


        </tr>
    </c:forEach>
</table>

<br><br><br>
<a href = "/home">Powrot do strony glownej</a><br>
</body>
</html>