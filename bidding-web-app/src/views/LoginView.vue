<template>
  <div class="login-container">
    <div class="login-root">
      <div class="login-left">
        <div>集中采购管理系统</div>
        <div>全流程电子化管理</div>
        <div>公平、公正、阳光、透明</div>
      </div>
      <div class="login-right">
        <div class="login-form-header">
          <div class="login-form-header-title">欢迎使用集中采购管理系统</div>
        </div>
        <div class="login-form-body">
        <el-form ref="loginForm" :model="form" label-width="54">
          <el-form-item label="账号" >
            <el-input v-model="form.username" autocomplete="off"  placeholder="用户名"></el-input>
          </el-form-item>
          <el-form-item label="密码">
            <el-input type="password" v-model="form.password"  autocomplete="off"
                      placeholder="密码"></el-input>
          </el-form-item>
          <el-form-item label="验证码">
            <el-input v-model="form.code"  autocomplete="off" placeholder="验证码"></el-input>
          </el-form-item>
          <el-form-item>
            <el-button type="primary" @click="submitForm">登录</el-button>
          </el-form-item>
        </el-form>
        </div>
      </div>
    </div>
  </div>
</template>
<script setup>
import {reactive} from 'vue'
const form = reactive({
  username: '',
  password: '',
  code: ''
});

const submitForm = () => {

}
</script>
<style scoped>
.login-container {
  position: absolute;
  top: 50%;
  left: 50%;
  width: 1000px;
  padding: 0;
  transform: translate(-50%, -50%);
}

.login-root {
  height: 450px;
  display: flex;
  box-shadow: 0 40px 40px #8d96a01a;
}

.login-left, .login-right {
  width: 50%;
  height: 100%;
}

.login-left {
  color: #fff;
  position: relative;
  padding: 80px 80px 48px;
  background: linear-gradient(0deg, #3a485a 0%, #607089 100%)
}

.login-right {
  margin: 0 auto;
  background: linear-gradient(0deg, var(--vt-c-white) 0%, var(--vt-c-white) 100%);
  padding: 64px 70px 48px;
}
.login-form-header{
  font-size: 24px;
  line-height: 33px;
  margin-bottom: 8px;
}
.login-form-header-title{
  font-size: 18px;
  text-align: center;
  margin-bottom: 18px;
  font-weight: 500;
}
.login-form-body ,.login-form-body button{
  width: 100%;
}
</style>