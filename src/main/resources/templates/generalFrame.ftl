<#macro frame title>
<!DOCTYPE html>
<html lang="zh-CN">
  <head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <meta http-equiv="Cache-Control" content="no-cache, no-store, must-revalidate" />
    <meta http-equiv="Pragma" content="no-cache" />
    <meta http-equiv="Expires" content="0" />
    <title>${title?html}</title>

    <link rel="stylesheet" media="screen" href="/stylesheets/bootstrap.min.css">
    <link rel="stylesheet" media="screen" href="/stylesheets/ui.jqgrid-bootstrap.css">
    <link rel="stylesheet" media="screen" href="/stylesheets/main.css">

    <script src="/javascripts/jquery-1.11.2.min.js" type="text/javascript"></script>
    <script src="/javascripts/bootstrap.min.js" type="text/javascript"></script>
    <script src="/javascripts/jqgrid/jquery.jqGrid.js" type="text/javascript"></script>
    <script src="/javascripts/jqgrid/jqGrid.support.js" type="text/javascript"></script>
    <script src="/javascripts/jqgrid/grid.locale-cn.js" type="text/javascript"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>

    <![endif]-->

  </head>
  <body>
    <#nested/>
  </body>
</html>
</#macro>