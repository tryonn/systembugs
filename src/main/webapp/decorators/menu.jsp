<div class="container-fluid">
	 <div class="row">
	 	<div class="col-sm-3 col-md-2 sidebar">
          <ul class="nav nav-sidebar">
            <li><a href="#">Overview <span class="sr-only" target="_blank">(current)</span></a></li>
            <li><a href="${linkTo[StatusController].index }" target="_blank">Status</a></li>
            <li><a href="${linkTo[ProductController].index }" target="_blank">Produtos</a></li>
            <li><a href="${linkTo[AccountsController].index }" target="_blank">Usuários</a></li>
			<li><a href="${linkTo[BugsController].form }" target="_blank">Bugs</a></li>
          </ul>
        </div>
        <%@include file="/decorators/contentmain.jsp"%>
	 </div>
</div>