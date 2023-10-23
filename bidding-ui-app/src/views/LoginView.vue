<template>
  <div class="login-container">
    <div class="panel panel-default login-panel">
      <div class="panel-heading">登录入口</div>
      <div class="panel-body">
        <div class="input-group">
          <span class="input-group-addon glyphicon glyphicon-user"></span>
          <input type="text" class="form-control" placeholder="用户名">
        </div>
        <div class="input-group">
          <span class="input-group-addon glyphicon glyphicon-lock" ></span>
          <input type="password" class="form-control" placeholder="密码">
        </div>
        <div class="input-group">
          <span class="input-group-addon glyphicon glyphicon-picture"></span>
          <input type="text" class="form-control" placeholder="验证码">
        </div>
        <div class="btn-group">
           <button class="btn btn-info " id="login-btn" type="button">登录</button>
        </div>
      </div>

    </div>
  </div>
</template>