<template>

  <el-form ref="loginForm" :model="form" label-width="80px">
    <el-form-item label="账号">
      <el-input v-model="form.username" autocomplete="off" style="width: 240px" placeholder="用户名"></el-input>
    </el-form-item>
    <el-form-item label="密码">
      <el-input type="password" v-model="form.password" style="width: 240px" autocomplete="off"
                placeholder="密码"></el-input>
    </el-form-item>
    <el-form-item label="验证码">
      <el-input v-model="form.code" style="width: 240px" autocomplete="off" placeholder="验证码"></el-input>
    </el-form-item>
    <el-form-item>
      <el-button type="primary" @click="submitForm"  >
        登录
      </el-button>
      <el-button type="primary" style="margin-left: 16px" @click="drawer = true">
        with footer
      </el-button>
    </el-form-item>
  </el-form>
  <RightDrawer v-model="drawer" />
</template>
<script lang="ts" setup>
import {reactive,ref} from 'vue'
import RightDrawer from "@/components/RightDrawer.vue";
const drawer=ref(false)
// do not use same name with ref
const form = reactive({
  username: '',
  password: '',
  code: ''
});

const submitForm = () => {

}
</script>