<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template" %>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags" %>
<%@ taglib prefix="common" tagdir="/WEB-INF/tags/responsive/common" %>

 
<template:page pageTitle="${pageTitle}">
    <div id="globalMessages">
        <common:globalMessages/>
    </div>
   
   
        <cms:pageSlot position="loginParagraph" var="feature" element="div" class="loginBannerParagraph">
        <cms:component component="${feature}" />
    </cms:pageSlot>
    <div class="loginBannerParentDiv">
    <cms:pageSlot position="loginBanner" var="feature" element="div" class="span-24 section5 loginBannerImg">
    <div class="loginBannerChildDiv">
        <cms:component component="${feature}" />
        </div>
    </cms:pageSlot>
    </div>
</template:page>