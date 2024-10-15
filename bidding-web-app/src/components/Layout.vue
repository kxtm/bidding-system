<template>
  <div class="layout">
    <el-container>
      <el-header>
       <div class="header-logo"><img src="@/assets/logo.svg"></div>
        <div class="header-menu" v-if="menus.length>0">
        <el-menu  mode="horizontal" @select="handleSelect" :ellipsis="false" v-for="(obj,index) in menus" key="index"  :router="true" background-color="#E8340C" >
           <el-menu-item :index="obj.url">{{obj.title}}</el-menu-item>
        </el-menu>
        </div>
      </el-header>
      <el-container>
        <el-aside width="200px">
           <el-menu>

              <el-menu-item index="1">仪表盘</el-menu-item>
              <el-sub-menu index="2">
                  <template #title>我的工作</template>
                  <el-menu-item index="1-1">item one</el-menu-item>
                  <el-menu-item index="1-2">item two</el-menu-item>
              </el-sub-menu>
           </el-menu>
        </el-aside>
        <el-main><router-view /></el-main>
      </el-container>
    </el-container>
    <el-container>
      <el-footer>页面底部</el-footer>
    </el-container>
  </div>
  <el-backtop :right="100" :bottom="100" />
</template>
<script lang="ts" setup>
 import {ref} from "vue";

 const  menus=[{"title":"工作台","url":"/","child":[{"title":"仪表盘","url":"/"},{"title":"我的工作","url":"/","child":[{"title":"菜单1","url":"/"},{"title":"菜单2","url":"/"}]}]},{"title":"采购业务实施","url":"/about/index"},{"title":"采购项目管理","url":"/"},{"title":"供应商管理","url":"/"},{"title":"合同履约管理","url":"/"},{"title":"信息报表查询","url":"/"},{"title":"系统管理","url":"/"}]
 const subMenus=ref();
 const handleSelect=(key: string, keyPath: string[]) => {

   menus.forEach(e=>{
     if(e.url==key){
       console.log(e.child)
       subMenus.value=e.child
     }
   })
   console.log(subMenus.value)
 }
</script>
<style>
.layout{
   width: 100%;
  height: 100vh;
}
.layout .el-header{
  background: #E8340C;
  --el-header-padding: 0 0;
  display: flex;
}
.layout .el-aside{
  background: bisque;
  height: 91vh;
}
.layout .el-main{
  background: #fff;
}
.layout .el-footer{
  background: black;
  --el-footer-padding: 0 0;
}
.header-logo img{
  width: 200px;
  height: 60px;
}
.header-menu{
  display: flex;
  --el-menu-text-color:#fff;
  --el-menu-active-color:#fff;
}
.el-menu--horizontal.el-menu{
  border-bottom: none !important;
}
.el-menu--horizontal>.el-menu-item.is-active {
   border-bottom:none !important;
   color: #fff !important;
}
</style>