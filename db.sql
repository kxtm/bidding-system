

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sys_auth
-- ----------------------------
DROP TABLE IF EXISTS `sys_auth`;
CREATE TABLE `sys_auth`  (
                             `ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '逻辑主键无意义',
                             `EMP_ID` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '用户代码',
                             `ROLE_ID` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '角色代码',
                             `ORG_ID` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '机构代码',
                             `Create_Pk` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建人主键',
                             `Create_By` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建人名称',
                             `Modify_Pk` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '修改人主键',
                             `Modify_By` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '修改人名称',
                             `Create_Time` datetime NULL DEFAULT NULL COMMENT '创建时间',
                             `Modify_Time` datetime NULL DEFAULT NULL COMMENT '修改时间',
                             PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_auth
-- ----------------------------

-- ----------------------------
-- Table structure for sys_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_menu`;
CREATE TABLE `sys_menu`  (
                             `id` bigint(20) NOT NULL AUTO_INCREMENT,
                             `MENU_ID` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '菜单ID',
                             `MENU_NAME` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '菜单名称',
                             `MENU_PARENT_ID` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '父菜单ID',
                             `MENU_TYPE` int(1) NULL DEFAULT NULL COMMENT '菜单类型 （0目录 1菜单 2按钮）',
                             `MENU_LEVEL` int(1) NULL DEFAULT NULL COMMENT '菜单级别 1级 2级 3级',
                             `MENU_URL` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '菜单URL',
                             `MENU_Auth` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '菜单权限',
                             `MENU_STATE` int(1) NULL DEFAULT NULL COMMENT '菜单状态 0禁用 1正常',
                             `MENU_SORT` int(11) NULL DEFAULT NULL COMMENT '菜单序号',
                             `REMARK` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '菜单备注',
                             `Create_By` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建人名称',
                             `Modify_Pk` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '修改人主键',
                             `Modify_By` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '修改人名称',
                             `Create_Time` datetime NULL DEFAULT NULL COMMENT '创建时间',
                             `Modify_Time` datetime NULL DEFAULT NULL COMMENT '修改时间',
                             PRIMARY KEY (`id`) USING BTREE,
                             UNIQUE INDEX `MENU_ID`(`MENU_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_menu
-- ----------------------------

-- ----------------------------
-- Table structure for sys_org
-- ----------------------------
DROP TABLE IF EXISTS `sys_org`;
CREATE TABLE `sys_org`  (
                            `ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '逻辑主键无意义',
                            `ORG_ID` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '机构ID 主键',
                            `ORG_CODE` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '机构代码',
                            `ORG_NAME` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '机构名称',
                            `ORG_SHORT_NAME` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '机构简称',
                            `ORG_PARENT_ID` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '父机构ID',
                            `ORG_TYPE` int(11) NULL DEFAULT NULL COMMENT '机构类型 -1根 1公司 2部门 3处 4科 5团 6组',
                            `ORG_LEVEL` int(11) NULL DEFAULT NULL COMMENT '机构级别 -1根级别 0总公司级别 1省公司 2地市 3县市 4乡镇 5村',
                            `ORG_SORT` int(11) NULL DEFAULT NULL COMMENT '机构序号',
                            `ORG_STATUS` int(2) NULL DEFAULT NULL COMMENT '机构状态',
                            `Remark` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
                            `ORG_CORP_ID` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '所属机构ID',
                            `ORG_CORP_NAME` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '所属机构名称',
                            `ORG_BRANCH_ID` varchar(32) CHARACTER SET gbk COLLATE gbk_bin NULL DEFAULT NULL COMMENT '所在本部/总部/省公司 机构ID',
                            `ORG_BRANCH_NAME` varchar(255) CHARACTER SET gbk COLLATE gbk_bin NULL DEFAULT NULL COMMENT '所在本部/总部/省公司 机构名称',
                            `ORG_CITY_ID` varchar(32) CHARACTER SET gbk COLLATE gbk_bin NULL DEFAULT NULL COMMENT '所在地市公司 机构ID',
                            `ORG_CITY_NAME` varchar(255) CHARACTER SET gbk COLLATE gbk_bin NULL DEFAULT NULL COMMENT '所在地市公司 机构名称',
                            `ORG_County_ID` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '所在县市公司机构ID',
                            `ORG_County_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '所在县市公司机构名称',
                            `ORG_SEQ` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '机构所在路径编码',
                            `ORG_SEQ_CH` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '机构所在中文路径',
                            `Create_Pk` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建人主键',
                            `Create_By` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建人名称',
                            `Modify_Pk` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '修改人主键',
                            `Modify_By` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '修改人名称',
                            `Create_Time` datetime NULL DEFAULT NULL COMMENT '创建时间',
                            `Modify_Time` datetime NULL DEFAULT NULL COMMENT '修改时间',
                            PRIMARY KEY (`ID`) USING BTREE,
                            UNIQUE INDEX `ORG_ID`(`ORG_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_org
-- ----------------------------
INSERT INTO `sys_org` VALUES (1, '0', '0', '人保集团', '人保集团', '-1', -1, -1, 0, 1, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '0', '人保集团', 'admin', '管理员', NULL, NULL, '2023-07-19 10:56:30', NULL);
INSERT INTO `sys_org` VALUES (2, '1', '1', '集团本部', '集团本部', '0', 1, 0, 1, 1, NULL, '1', '集团本部', '1', '集团本部', NULL, NULL, NULL, NULL, '0,1', '人保集团\\集团本部', 'admin', '管理员', NULL, NULL, '2023-07-19 11:00:07', NULL);
INSERT INTO `sys_org` VALUES (3, '11', '11', '财务部', '财务部', '1', 2, 0, 1, 1, NULL, '1', '集团本部', '1', '集团本部', NULL, NULL, NULL, NULL, '0,1,11', '人保集团\\集团本部\\财务部', 'admin', '管理员', NULL, NULL, '2023-07-19 11:04:00', NULL);
INSERT INTO `sys_org` VALUES (4, '111', '111', '采购处', '采购处', '11', 3, 0, 1, 1, NULL, '1', '集团本部', '1', '集团本部', NULL, NULL, NULL, NULL, '0,1,11,111', '人保集团\\集团本部\\财务部\\采购处', 'admin', '管理员', NULL, NULL, '2023-07-19 11:05:27', NULL);

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role`  (
                             `ID` bigint(20) NOT NULL AUTO_INCREMENT,
                             `Role_ID` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '角色ID',
                             `Role_Code` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '角色代码',
                             `Role_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '角色名称',
                             `Role_Type` int(2) NOT NULL COMMENT '角色类型',
                             `Role_STATE` int(1) NOT NULL COMMENT '角色状态',
                             `Remark` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '角色描述',
                             `Create_Pk` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建人主键',
                             `Create_By` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建人名称',
                             `Modify_Pk` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '修改人主键',
                             `Modify_By` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '修改人名称',
                             `Create_Time` datetime NULL DEFAULT NULL COMMENT '创建时间',
                             `Modify_Time` datetime NULL DEFAULT NULL COMMENT '修改时间',
                             PRIMARY KEY (`ID`) USING BTREE,
                             UNIQUE INDEX `Role_ID`(`Role_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_role
-- ----------------------------
INSERT INTO `sys_role` VALUES (1, 'admin', 'admin', '管理员', 1, 1, '管理员', 'admin', '管理员', NULL, NULL, '2023-07-19 10:51:40', NULL);

-- ----------------------------
-- Table structure for sys_role_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_menu`;
CREATE TABLE `sys_role_menu`  (
                                  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
                                  `ROLE_ID` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
                                  `MENU_ID` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
                                  `Create_Pk` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建人主键',
                                  `Create_By` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建人名称',
                                  `Modify_Pk` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '修改人主键',
                                  `Modify_By` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '修改人名称',
                                  `Create_Time` datetime NULL DEFAULT NULL COMMENT '创建时间',
                                  `Modify_Time` datetime NULL DEFAULT NULL COMMENT '修改时间',
                                  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_role_menu
-- ----------------------------

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user`  (
                             `ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '逻辑主键非业务主键 无意义',
                             `EMP_ID` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '唯一员工主键',
                             `EMP_Code` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '员工代码',
                             `EMP_Name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '员工姓名',
                             `EMP_Pwd` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '员工密码',
                             `EMP_Sex` int(1) NULL DEFAULT NULL COMMENT '员工性别 0女 1男',
                             `EMP_level` int(4) NULL DEFAULT NULL COMMENT '员工级别代码',
                             `EMP_type` int(1) NULL DEFAULT NULL COMMENT '员工类型 1内部0外部',
                             `EMP_mobile` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '员工手机',
                             `EMP_phone` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '员工工作电话',
                             `EMP_email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '员工工作邮箱',
                             `EMP_State` int(1) NULL DEFAULT NULL COMMENT '员工状态 0 禁用 1正常',
                             `EMP_Sort` int(11) NULL DEFAULT NULL COMMENT '员工序号',
                             `OPER_TYPE` int(2) NULL DEFAULT NULL COMMENT '数据范围控制 0关闭 只能看当前所属范围数据 1 看到配置的数据范围数据',
                             `REMARK` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
                             `Create_Pk` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建人主键',
                             `Create_By` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建人名称',
                             `Modify_Pk` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '修改人主键',
                             `Modify_By` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '修改人名称',
                             `Create_Time` datetime NULL DEFAULT NULL COMMENT '创建时间',
                             `Modify_Time` datetime NULL DEFAULT NULL COMMENT '修改时间',
                             PRIMARY KEY (`ID`) USING BTREE,
                             UNIQUE INDEX `EMP_ID`(`EMP_ID`) USING BTREE COMMENT '业务主键唯一'
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES (1, 'admin', 'admin', '管理员', '123456', 1, 0, 1, '13000000011', '010-1234567', 'admin@admin.com', 1, 1, 0, NULL, 'admin', '管理员', NULL, NULL, '2023-07-19 10:53:07', NULL);

-- ----------------------------
-- Table structure for sys_user_org
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_org`;
CREATE TABLE `sys_user_org`  (
                                 `ID` bigint(20) NOT NULL AUTO_INCREMENT,
                                 `EMP_ID` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
                                 `ORG_ID` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '部门ID',
                                 `ORG_Name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '部门名称',
                                 `USE_TYPE` int(1) NULL DEFAULT NULL COMMENT '1 就职部门 2兼职部门',
                                 `USE_STATE` int(1) NULL DEFAULT NULL COMMENT '0 不使用 1使用中',
                                 `ORG_SEQ` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '完整部门所在部门代码路径',
                                 `ORG_SEQ_CH` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '完整的部门所在部门名称',
                                 `Create_Pk` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建人主键',
                                 `Create_By` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建人名称',
                                 `Modify_Pk` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '修改人主键',
                                 `Modify_By` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '修改人名称',
                                 `Create_Time` datetime NULL DEFAULT NULL COMMENT '创建时间',
                                 `Modify_Time` datetime NULL DEFAULT NULL COMMENT '修改时间',
                                 PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_user_org
-- ----------------------------
INSERT INTO `sys_user_org` VALUES (1, 'admin', '111', '采购处', 1, 1, '0,1,11,111', '人保集团\\集团本部\\财务部\\采购处', 'admin', '管理员', NULL, NULL, '2023-07-19 11:07:15', NULL);

SET FOREIGN_KEY_CHECKS = 1;
