<template>
  <el-drawer v-model="drawer" direction="rtl">
    <template #header>
      <h4>右侧弹窗DEMO</h4>
    </template>
    <template #default>
      <el-radio-group v-model="radio">
        <el-radio :value="3" >Option A</el-radio>
        <el-radio :value="6" >Option B</el-radio>
        <el-radio :value="9" >Option C</el-radio>
      </el-radio-group>
    </template>
    <template #footer>
      <div style="flex: auto">
        <el-button @click="cancelClick">取消</el-button>
        <el-button type="primary" @click="confirmClick">确认</el-button>
      </div>
    </template>
  </el-drawer>
</template>
<script lang="ts" setup>
import {ref} from 'vue'
import {ElMessage, ElMessageBox} from 'element-plus'

const radio = ref(1)
const drawer = ref(false)

function cancelClick() {
  drawer.value = false
}

function confirmClick() {
  console.log(radio)
  ElMessageBox.confirm(`确认选择 ${radio.value} ?`, '确认信息', {cancelButtonText: '取消', confirmButtonText: '确定'})
      .then(() => {drawer.value = false;ElMessage({type: 'success', message: '操作完成',})})
      .catch(() => {ElMessage({type: 'info', message: '操作取消',})
  })
}
</script>


