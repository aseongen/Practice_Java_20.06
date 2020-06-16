<%@ page contentType="text/html; charset=UTF-8"%>
<%-- jsp주석문 기호. jsp주석문 기호는 html주석문과는 같게 브라우저 출력창에
나오지 않는 것은 같지만 html과는 다르게 소스보기에서는 보이지 않아서 보안성이 우수하다. 
--%>
<%-- %@룰 지시자라 한다. 어떤 정의문을 내릴 때 사용한다. contentType속성값은 브라우
저에 출력되는 문자/태그 정의, charset은 언어코딩 타입을 UTF-8 로 설정. --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome to Fun Web</title>
<link rel="stylesheet" type="text/css" href="./css/default.css" />
</head>
<body>
 <div id="wrap">
  <%-- 상단영역 --%>
  <header>
   <div id="login">
    <a href="#">login</a> | <a href="#">Join</a>
   </div>
   <div class="clear"></div>
   <%--회사 로고--%>
   <div id="logo">
   <img src="./images/logo.gif" width="265" height="62" 
   alt="Fun Web" />
   </div>
   <%--메뉴구성 --%>
   <nav>
     <ul>
      <li><a href="index.jsp">HOME</a></li>
      <li><a href="#">COMPANY</a></li>
      <li><a href="#">SOLUTIONS</a></li>
      <li><a href="#">CUSTOMER CENTER</a></li>
      <li><a href="#">CONTACT US</a></li>
     </ul>
   </nav>
  </header>
  
  <div class="clear"></div>
  
  <%--메인 이미지 --%>
  <div id="main_img">
  <img src="./images/main_img.jpg" width="971" height="282" />
  </div>
  
  <div class="clear"></div>
  
  <%--본문 내용 --%>
  <article id="front">
    <div id="solution">
      <div id="hosting">
       <h3>Web Hosting Solution</h3>
        <p>Lorem ... Ut velest</p>
        <p>Lorem ... Ut velest</p>
        <p>Lorem ... Ut velest</p>      
        <p>Lorem ... Ut velest</p> 
        <p>Lorem ... Ut velest</p>      
        <p>Lorem ... Ut velest</p>     
      </div>
      <div id="security">
       <h3>Web Security Solution</h3>
        <p>Lorem ... Ut velest</p>
        <p>Lorem ... Ut velest</p>
        <p>Lorem ... Ut velest</p>      
        <p>Lorem ... Ut velest</p> 
        <p>Lorem ... Ut velest</p>      
        <p>Lorem ... Ut velest</p> 
      </div>
      <div id="payment">
       <h3>Web payment Solution</h3>
        <p>Lorem ... Ut velest</p>
        <p>Lorem ... Ut velest</p>
        <p>Lorem ... Ut velest</p>      
        <p>Lorem ... Ut velest</p> 
        <p>Lorem ... Ut velest</p>      
        <p>Lorem ... Ut velest</p> 
      </div>
    </div>
    
    <div class="clear"></div>
    
    <div id="sec_news">
     <h3><span class="orange">Security</span> News</h3>
     <dl>
      <dt><a href="#">Vivamus id ligula ...</a></dt>
      <dd><a href="#">Proin quis ante...</a></dd>
      <dt><a href="#">Vivamus id ligula ...</a></dt>
      <dd><a href="#">Proin quis ante...</a></dd>
     </dl>
    </div>
    
    <div id="news_notice">
     <h3 class="brown">News &amp; Notice</h3><%-- &amp;은 특수문자
     로 &로 표시 --%>
     <table>
      <tr>
       <td class="contxt"><a href="#">Vivamus ...</a></td>
       <td><a href="#">2020.06.16</a></td>
      </tr>
      <tr>
       <td class="contxt">Fusce ...</td>
       <td>2020.06.11</td>
      </tr>
      <tr>
       <td class="contxt">Donec ...</td>
       <td>2020.06.15</td>
      </tr>
      <tr>
       <td class="contxt">Aenean ...</td>
       <td>2020.06.13</td>
      </tr>
      
     </table>
    </div>
  </article>
  
  <div class="clear"></div>
  <%--하단영역 --%>
  <footer>
  
  </footer>
 </div>
</body>
</html>





