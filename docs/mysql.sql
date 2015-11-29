/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2015/11/26 21:01:07                          */
/*==============================================================*/


drop index asIdx on APIService;

drop table if exists APIService;

drop table if exists APIServiceParams;

drop index appIdx on Application;

drop table if exists Application;

drop table if exists AuthAssign;

drop table if exists AuthDependency;

drop index apIdx on AuthPoint;

drop table if exists AuthPoint;

drop index csIdx on CodeService;

drop table if exists CodeService;

drop index cuIdx on CompositeUI;

drop table if exists CompositeUI;

drop table if exists Configuration;

drop index ddIdx on DataDictionary;

drop table if exists DataDictionary;

drop index ecIdx on EntityConfig;

drop table if exists EntityConfig;

drop index euIdx on EntityUI;

drop table if exists EntityUI;

drop index fcIdx on FormConfig;

drop table if exists FormConfig;

drop index lcIdx on ListConfig;

drop table if exists ListConfig;

drop index moduleIdx on Module;

drop table if exists Module;

drop index olIdx on OperationLog;

drop table if exists OperationLog;

drop index orgIdx on Orgnization;

drop table if exists Orgnization;

drop index pcIdx on PropertyConfig;

drop table if exists PropertyConfig;

drop index rlIdx on Role;

drop table if exists Role;

drop index rurIdx on RoleUserRef;

drop table if exists RoleUserRef;

drop table if exists SystemLog;

drop index smIdx on SystemMenu;

drop table if exists SystemMenu;

drop index trIdx on TextResource;

drop table if exists TextResource;

drop index tvcIdx on TreeviewConfig;

drop table if exists TreeviewConfig;

drop index uoIdx on UIOperation;

drop table if exists UIOperation;

drop index usrIdx on Users;

drop table if exists Users;

drop index vsIdx on ViewService;

drop table if exists ViewService;

drop table if exists WorkflowComments;

drop index wfcIdx on WorkflowConfig;

drop table if exists WorkflowConfig;

drop table if exists WorkflowInstance;

drop index wfnIdx on WorkflowNode;

drop table if exists WorkflowNode;

drop table if exists WorkflowOperation;

/*==============================================================*/
/* Table: APIService                                            */
/*==============================================================*/
create table APIService
(
   as_sid               varchar(36) not null,
   as_app_sid           varchar(36),
   as_name              varchar(200) not null,
   as_path              text not null,
   as_return_type       varchar(100),
   as_type              int,
   as_group             varchar(200),
   as_desc              text,
   primary key (as_sid)
);

/*==============================================================*/
/* Index: asIdx                                                 */
/*==============================================================*/
create index asIdx on APIService
(
   as_name
);

/*==============================================================*/
/* Table: APIServiceParams                                      */
/*==============================================================*/
create table APIServiceParams
(
   asp_sid              varchar(36) not null,
   asp_as_sid           varchar(36) not null,
   asp_name             varchar(36) not null,
   asp_param_type       varchar(200),
   asp_default_value    text,
   asp_desc             text,
   primary key (asp_sid)
);

/*==============================================================*/
/* Table: Application                                           */
/*==============================================================*/
create table Application
(
   app_sid              varchar(36) not null,
   app_sno              varchar(50) not null,
   app_name             varchar(200) not null,
   app_db_conn          varchar(200),
   app_status           int not null,
   app_type             int not null,
   app_path             text,
   app_ext              text,
   app_desc             text,
   primary key (app_sid)
);

/*==============================================================*/
/* Index: appIdx                                                */
/*==============================================================*/
create unique index appIdx on Application
(
   app_sno
);

/*==============================================================*/
/* Table: AuthAssign                                            */
/*==============================================================*/
create table AuthAssign
(
   aa_sid               varchar(36) not null,
   aa_ap_sid            varchar(36),
   aa_assigned_type     int not null comment '角色/用户',
   aa_assigned_sid      varchar(36) not null,
   aa_ext               text,
   primary key (aa_sid)
);

/*==============================================================*/
/* Table: AuthDependency                                        */
/*==============================================================*/
create table AuthDependency
(
   ad_sid               varchar(36) not null,
   ad_ap_sid            varchar(36),
   ad_deps_type         varchar(50) not null comment '菜单/UI操作/代码服务/前台页面',
   ad_deps_sid          varchar(36) not null,
   ad_ext               text,
   primary key (ad_sid)
);

/*==============================================================*/
/* Table: AuthPoint                                             */
/*==============================================================*/
create table AuthPoint
(
   ap_sid               varchar(36) not null,
   ap_name              varchar(200) not null,
   ap_app_sid           varchar(36),
   ap_module_sid        varchar(36),
   ap_ext               text,
   ap_desc              text,
   primary key (ap_sid)
);

/*==============================================================*/
/* Index: apIdx                                                 */
/*==============================================================*/
create index apIdx on AuthPoint
(
   ap_name,
   ap_app_sid,
   ap_module_sid
);

/*==============================================================*/
/* Table: CodeService                                           */
/*==============================================================*/
create table CodeService
(
   cs_sid               varchar(36) not null,
   cs_app_sid           varchar(36),
   cs_module_sid        varchar(36) not null,
   cs_name              varchar(200) not null,
   cs_annotation        int not null,
   cs_file_path         text not null,
   cs_prj_name          varchar(200),
   cs_class             varchar(400) not null,
   cs_interface         varchar(400),
   cs_desc              text,
   primary key (cs_sid)
);

/*==============================================================*/
/* Index: csIdx                                                 */
/*==============================================================*/
create index csIdx on CodeService
(
   cs_name
);

/*==============================================================*/
/* Table: CompositeUI                                           */
/*==============================================================*/
create table CompositeUI
(
   cu_sid               varchar(36) not null,
   cu_ec_sid            varchar(36) not null,
   cu_eu_sid            varchar(36) not null,
   cu_view              varchar(36) not null,
   cu_is_main           boolean not null,
   cu_params            varchar(1000),
   cu_icon              varchar(400),
   cu_sort              int not null,
   cu_title             varchar(400),
   cu_desc              text,
   primary key (cu_sid)
);

/*==============================================================*/
/* Index: cuIdx                                                 */
/*==============================================================*/
create index cuIdx on CompositeUI
(
   cu_ec_sid,
   cu_eu_sid,
   cu_view
);

/*==============================================================*/
/* Table: Configuration                                         */
/*==============================================================*/
create table Configuration
(
   cf_sid               varchar(36) not null,
   cf_owner_type        int,
   cf_owner_sid         varchar(36),
   cf_name              varchar(200),
   cf_title             varchar(400),
   cf_content           text,
   cf_group             varchar(200),
   primary key (cf_sid)
);

/*==============================================================*/
/* Table: DataDictionary                                        */
/*==============================================================*/
create table DataDictionary
(
   dd_sid               varchar(36) not null,
   dd_app_sid           varchar(36),
   dd_name              varchar(200) not null,
   dd_value             int not null,
   dd_code              varchar(100),
   dd_parent            varchar(36),
   dd_sub_max           int,
   dd_type              int not null,
   dd_icon              varchar(400),
   dd_desc              text,
   primary key (dd_sid)
);

/*==============================================================*/
/* Index: ddIdx                                                 */
/*==============================================================*/
create unique index ddIdx on DataDictionary
(
   dd_value,
   dd_code
);

/*==============================================================*/
/* Table: EntityConfig                                          */
/*==============================================================*/
create table EntityConfig
(
   ec_sid               varchar(36) not null,
   ec_app_sid           varchar(36),
   ec_module_sid        varchar(36),
   ec_name              varchar(200),
   ec_class             varchar(200),
   ec_schema            varchar(100),
   ec_cache             boolean,
   ec_ext_col           varchar(50),
   ec_ext_value         int not null,
   ec_parent            varchar(36),
   ec_status_col        varchar(50),
   ec_status_value      int not null,
   ec_del_col           varchar(50),
   ec_type_col          varchar(50),
   ec_PK_col            varchar(50),
   ec_col_amount        int not null,
   ec_desc              text,
   primary key (ec_sid)
);

/*==============================================================*/
/* Index: ecIdx                                                 */
/*==============================================================*/
create unique index ecIdx on EntityConfig
(
   ec_name,
   ec_class
);

/*==============================================================*/
/* Table: EntityUI                                              */
/*==============================================================*/
create table EntityUI
(
   eu_sid               varchar(36) not null,
   eu_ec_sid            varchar(36) not null,
   eu_name              varchar(200) not null,
   eu_type              int not null,
   eu_readonly          boolean not null,
   eu_title             varchar(400),
   eu_desc              text,
   primary key (eu_sid)
);

/*==============================================================*/
/* Index: euIdx                                                 */
/*==============================================================*/
create unique index euIdx on EntityUI
(
   eu_name
);

/*==============================================================*/
/* Table: FormConfig                                            */
/*==============================================================*/
create table FormConfig
(
   fc_sid               varchar(36) not null,
   fc_ec_sid            varchar(36) not null,
   fc_eu_sid            varchar(36) not null,
   fc_pc_sid            varchar(36) not null,
   fc_visibility        boolean not null,
   fc_readonly          boolean not null,
   fc_template          text,
   fc_deps_sid          varchar(36),
   fc_deps_value        varchar(200),
   fc_sort              int not null,
   primary key (fc_sid)
);

/*==============================================================*/
/* Index: fcIdx                                                 */
/*==============================================================*/
create index fcIdx on FormConfig
(
   fc_ec_sid,
   fc_eu_sid,
   fc_pc_sid
);

/*==============================================================*/
/* Table: ListConfig                                            */
/*==============================================================*/
create table ListConfig
(
   lc_sid               varchar(36) not null,
   lc_ec_sid            varchar(36) not null,
   lc_eu_sid            varchar(36) not null,
   lc_pc_sid            varchar(36) not null,
   lc_width             double,
   lc_width_unit        varchar(10),
   lc_visibility        boolean not null,
   lc_sort              int not null,
   lc_filterable        boolean not null,
   lc_groupable         boolean not null,
   lc_sortable          boolean not null,
   primary key (lc_sid)
);

/*==============================================================*/
/* Index: lcIdx                                                 */
/*==============================================================*/
create index lcIdx on ListConfig
(
   lc_ec_sid,
   lc_eu_sid,
   lc_pc_sid
);

/*==============================================================*/
/* Table: Module                                                */
/*==============================================================*/
create table Module
(
   md_sid               varchar(36) not null,
   md_sno               varchar(50) not null,
   md_app_sid           varchar(36),
   md_status            int,
   md_ext               text,
   md_desc              text,
   primary key (md_sid)
);

/*==============================================================*/
/* Index: moduleIdx                                             */
/*==============================================================*/
create unique index moduleIdx on Module
(
   md_sno
);

/*==============================================================*/
/* Table: OperationLog                                          */
/*==============================================================*/
create table OperationLog
(
   ol_sid               varchar(36) not null,
   ol_app_sid           varchar(36),
   ol_user              varchar(50),
   ol_time              datetime,
   ol_type              int,
   ol_content           text,
   primary key (ol_sid)
);

/*==============================================================*/
/* Index: olIdx                                                 */
/*==============================================================*/
create index olIdx on OperationLog
(
   ol_user,
   ol_time
);

/*==============================================================*/
/* Table: Orgnization                                           */
/*==============================================================*/
create table Orgnization
(
   org_sid              varchar(36) not null,
   org_name             varchar(200) not null,
   org_parent           varchar(36),
   org_level            int not null,
   org_path             text,
   org_type             int not null comment '公司/部门/小组',
   org_charge           varchar(50),
   org_ext              text,
   org_desc             text,
   primary key (org_sid)
);

/*==============================================================*/
/* Index: orgIdx                                                */
/*==============================================================*/
create index orgIdx on Orgnization
(
   org_name,
   org_type
);

/*==============================================================*/
/* Table: PropertyConfig                                        */
/*==============================================================*/
create table PropertyConfig
(
   pc_sid               varchar(36) not null,
   pc_ec_sid            varchar(36) not null,
   pc_col_name          varchar(50) not null,
   pc_name              varchar(50) not null,
   pc_label             varchar(200),
   pc_data_type         varchar(200),
   pc_is_require        boolean not null,
   pc_is_pk             boolean not null,
   pc_is_name           boolean not null,
   pc_is_type           boolean not null,
   pc_is_richeditor     boolean not null,
   pc_width_type        int not null,
   pc_length            bigint not null,
   pc_ref_entity        varchar(36),
   pc_ref_name          varchar(100),
   pc_ref_select        int not null,
   pc_format            varchar(400),
   pc_wartermark        varchar(400),
   pc_validate_regx     varchar(1000),
   pc_edit_template     text,
   pc_view_template     text,
   pc_dictionary_value  int not null,
   pc_ext               text,
   pc_desc              text,
   primary key (pc_sid)
);

/*==============================================================*/
/* Index: pcIdx                                                 */
/*==============================================================*/
create unique index pcIdx on PropertyConfig
(
   pc_col_name,
   pc_name
);

/*==============================================================*/
/* Table: Role                                                  */
/*==============================================================*/
create table Role
(
   rl_sid               varchar(36) not null,
   rl_name              varchar(200),
   rl_app_sid           varchar(36),
   rl_sys               boolean,
   rl_status            int not null,
   rl_ext               text,
   rl_desc              text,
   primary key (rl_sid)
);

/*==============================================================*/
/* Index: rlIdx                                                 */
/*==============================================================*/
create index rlIdx on Role
(
   rl_name,
   rl_app_sid
);

/*==============================================================*/
/* Table: RoleUserRef                                           */
/*==============================================================*/
create table RoleUserRef
(
   rur_sid              varchar(36) not null,
   rur_rl_sid           varchar(36) not null,
   rul_usr_sid          varchar(36) not null,
   rul_org_sid          varchar(36) not null,
   primary key (rur_sid)
);

/*==============================================================*/
/* Index: rurIdx                                                */
/*==============================================================*/
create index rurIdx on RoleUserRef
(
   rur_rl_sid,
   rul_usr_sid,
   rul_org_sid
);

/*==============================================================*/
/* Table: SystemLog                                             */
/*==============================================================*/
create table SystemLog
(
   sl_sid               varchar(36) not null,
   sl_app_sid           varchar(36),
   sl_user              varchar(100),
   sl_class             varchar(200),
   sl_method            varchar(200),
   sl_time              datetime,
   sl_level             varchar(100),
   sl_content           text,
   primary key (sl_sid)
);

/*==============================================================*/
/* Table: SystemMenu                                            */
/*==============================================================*/
create table SystemMenu
(
   sm_sid               varchar(36) not null,
   sm_app_sid           varchar(36),
   sm_module_sid        varchar(36),
   sm_name              varchar(200) not null,
   sm_title             varchar(400),
   sm_parent            varchar(36),
   sm_view              varchar(36),
   sm_sort              int,
   sm_icon              varchar(400),
   sm_focus_icon        varchar(400),
   sm_desc              text,
   primary key (sm_sid)
);

/*==============================================================*/
/* Index: smIdx                                                 */
/*==============================================================*/
create unique index smIdx on SystemMenu
(
   sm_name
);

/*==============================================================*/
/* Table: TextResource                                          */
/*==============================================================*/
create table TextResource
(
   tr_sid               varchar(36) not null,
   tr_app_sid           varchar(36),
   tr_name              varchar(200) not null,
   tr_value             text,
   tr_group             varchar(200),
   tr_desc              text,
   primary key (tr_sid)
);

/*==============================================================*/
/* Index: trIdx                                                 */
/*==============================================================*/
create unique index trIdx on TextResource
(
   tr_name
);

/*==============================================================*/
/* Table: TreeviewConfig                                        */
/*==============================================================*/
create table TreeviewConfig
(
   tvc_sid              varchar(36) not null,
   tvc_ec_sid           varchar(36) not null,
   tvc_eu_sid           varchar(36) not null,
   tvc_node_entity      varchar(200) not null,
   tvc_node_value       int not null,
   tvc_node_title       varchar(200),
   tvc_parent           varchar(36),
   tvc_node_icon        varchar(400),
   tvc_link_view        varchar(36),
   tvc_link_params      text,
   tvc_filter_property  varchar(100),
   tvc_ext_condition    text,
   tvc_sort             int not null,
   tvc_self_ref         boolean not null,
   tvc_invalid_menus    text,
   tvc_ext_property     varchar(100),
   tvc_desc             text,
   primary key (tvc_sid)
);

/*==============================================================*/
/* Index: tvcIdx                                                */
/*==============================================================*/
create index tvcIdx on TreeviewConfig
(
   tvc_ec_sid,
   tvc_eu_sid
);

/*==============================================================*/
/* Table: UIOperation                                           */
/*==============================================================*/
create table UIOperation
(
   uo_sid               varchar(36) not null,
   uo_ec_sid            varchar(36),
   uo_eu_sid            varchar(36),
   uo_type              int,
   uo_name              varchar(200) not null,
   uo_title             varchar(200),
   uo_icon              varchar(400),
   uo_sort              int not null,
   uo_view              varchar(36),
   uo_param             varchar(1000),
   uo_action            varchar(36),
   primary key (uo_sid)
);

/*==============================================================*/
/* Index: uoIdx                                                 */
/*==============================================================*/
create index uoIdx on UIOperation
(
   uo_ec_sid,
   uo_eu_sid,
   uo_name
);

/*==============================================================*/
/* Table: Users                                                 */
/*==============================================================*/
create table Users
(
   usr_sid              varchar(36) not null,
   usr_sno              varchar(50),
   usr_pwd              varchar(200),
   usr_name             varchar(50),
   usr_gender           int not null,
   usr_photo            text,
   usr_birthday         date,
   usr_org              varchar(36),
   usr_type             int not null,
   usr_status           int not null,
   usr_email            varchar(100),
   usr_phone            varchar(50),
   usr_domain           varchar(200),
   usr_sys              boolean not null,
   usr_ext              text,
   usr_des              text,
   primary key (usr_sid)
);

/*==============================================================*/
/* Index: usrIdx                                                */
/*==============================================================*/
create index usrIdx on Users
(
   usr_sno,
   usr_type
);

/*==============================================================*/
/* Table: ViewService                                           */
/*==============================================================*/
create table ViewService
(
   vs_sid               varchar(36) not null,
   vs_name              varchar(200) not null,
   vs_file_path         text not null,
   vs_title             varchar(200),
   vs_app_sid           varchar(36),
   vs_module_sid        varchar(36),
   vs_desc              text,
   primary key (vs_sid)
);

/*==============================================================*/
/* Index: vsIdx                                                 */
/*==============================================================*/
create index vsIdx on ViewService
(
   vs_name
);

/*==============================================================*/
/* Table: WorkflowComments                                      */
/*==============================================================*/
create table WorkflowComments
(
   wfco_sid             varchar(36) not null,
   wfco_wfc_sid         varchar(36) not null,
   wfco_wfi_sid         varchar(36) not null,
   wfco_user            varchar(50) not null,
   wfco_time            datetime not null,
   wfco_wfo_sid         varchar(36) not null,
   wfco_content         text,
   wfco_ext             text,
   primary key (wfco_sid)
);

/*==============================================================*/
/* Table: WorkflowConfig                                        */
/*==============================================================*/
create table WorkflowConfig
(
   wfc_sid              varchar(36) not null,
   wfc_name             varchar(200) not null,
   wfc_app_sid          varchar(36),
   wfc_entity           varchar(36),
   wfc_parent           varchar(36),
   wfc_mail_template    varchar(200),
   wfc_timer_task       boolean,
   wfc_ext              text,
   wfc_desc             text,
   primary key (wfc_sid)
);

/*==============================================================*/
/* Index: wfcIdx                                                */
/*==============================================================*/
create index wfcIdx on WorkflowConfig
(
   wfc_name,
   wfc_entity
);

/*==============================================================*/
/* Table: WorkflowInstance                                      */
/*==============================================================*/
create table WorkflowInstance
(
   wfi_sid              varchar(36) not null,
   wfi_wfc_sid          varchar(36),
   wfi_entity_config    varchar(36) not null,
   wfi_entity_sid       varchar(36) not null,
   wfi_entity_status    int not null,
   wfi_instance_status  int not null,
   wfi_ext              text,
   primary key (wfi_sid)
);

/*==============================================================*/
/* Table: WorkflowNode                                          */
/*==============================================================*/
create table WorkflowNode
(
   wfn_sid              varchar(36) not null,
   wfn_name             varchar(200) not null,
   wfn_title            varchar(200),
   wfn_icon             text,
   wfn_dict_value       int,
   wfn_wfc_sid          varchar(36),
   wfn_entity           varchar(36),
   wfn_ext              text,
   wfn_desc             text,
   primary key (wfn_sid)
);

/*==============================================================*/
/* Index: wfnIdx                                                */
/*==============================================================*/
create index wfnIdx on WorkflowNode
(
   wfn_name,
   wfn_dict_value,
   wfn_wfc_sid
);

/*==============================================================*/
/* Table: WorkflowOperation                                     */
/*==============================================================*/
create table WorkflowOperation
(
   wfo_sid              varchar(36) not null,
   wfo_wfc_sid          varchar(36),
   wfo_name             varchar(200) not null,
   wfo_icon             varchar(400),
   wfo_title            varchar(400),
   wfo_entity           varchar(36),
   wfo_src_node         varchar(36),
   wfo_des_node         varchar(36),
   wfo_type             int not null comment '前台控件（菜单或按钮）/后台定时任务/都支持',
   wfo_prev_event       varchar(36),
   wfo_next_event       varchar(36),
   wfo_rollback         boolean,
   wfo_mail_template    varchar(50),
   wfo_ext              text,
   wfo_desc             text,
   primary key (wfo_sid)
);

alter table APIService add constraint ref_app_apisrv foreign key (as_app_sid)
      references Application (app_sid);

alter table APIServiceParams add constraint ref_apiSrv_apiSrvParams foreign key (asp_as_sid)
      references APIService (as_sid);

alter table AuthAssign add constraint ref_authpoint_assign foreign key (aa_ap_sid)
      references AuthPoint (ap_sid);

alter table AuthDependency add constraint ref_authpoint_authdeps foreign key (ad_ap_sid)
      references AuthPoint (ap_sid);

alter table AuthPoint add constraint ref_app_authpoint foreign key (ap_app_sid)
      references Application (app_sid);

alter table CodeService add constraint ref_app_codesrv foreign key (cs_app_sid)
      references Application (app_sid);

alter table CompositeUI add constraint ref_entityUI_compositeconfig foreign key (cu_eu_sid)
      references EntityUI (eu_sid);

alter table DataDictionary add constraint ref_datadict_app foreign key (dd_app_sid)
      references Application (app_sid);

alter table EntityConfig add constraint ref_app_entityconf foreign key (ec_app_sid)
      references Application (app_sid);

alter table EntityConfig add constraint ref_module_entityconf foreign key (ec_module_sid)
      references Module (md_sid);

alter table EntityUI add constraint ref_entityconfig_entityUI foreign key (eu_ec_sid)
      references EntityConfig (ec_sid);

alter table FormConfig add constraint ref_entityUI_formconfig foreign key (fc_eu_sid)
      references EntityUI (eu_sid);

alter table FormConfig add constraint ref_property_form foreign key (fc_pc_sid)
      references PropertyConfig (pc_sid);

alter table ListConfig add constraint ref_entityUI_listconfig foreign key (lc_eu_sid)
      references EntityUI (eu_sid);

alter table ListConfig add constraint ref_property_list foreign key (lc_pc_sid)
      references PropertyConfig (pc_sid);

alter table Module add constraint ref_app_module foreign key (md_app_sid)
      references Application (app_sid);

alter table OperationLog add constraint ref_app_operationlog foreign key (ol_app_sid)
      references Application (app_sid);

alter table PropertyConfig add constraint ref_entity_property foreign key (pc_ec_sid)
      references EntityConfig (ec_sid);

alter table Role add constraint ref_app_role foreign key (rl_app_sid)
      references Application (app_sid);

alter table RoleUserRef add constraint ref_org_roleuser foreign key (rul_org_sid)
      references Orgnization (org_sid);

alter table RoleUserRef add constraint ref_role_roleuser foreign key (rur_rl_sid)
      references Role (rl_sid);

alter table RoleUserRef add constraint ref_user_roleuser foreign key (rul_usr_sid)
      references Users (usr_sid);

alter table SystemLog add constraint ref_app_syslog foreign key (sl_app_sid)
      references Application (app_sid);

alter table SystemMenu add constraint ref_menu_app foreign key (sm_app_sid)
      references Application (app_sid);

alter table SystemMenu add constraint ref_module_menu foreign key (sm_module_sid)
      references Module (md_sid);

alter table SystemMenu add constraint ref_sysmenu_self foreign key (sm_parent)
      references SystemMenu (sm_sid);

alter table TextResource add constraint ref_textRes_app foreign key (tr_app_sid)
      references Application (app_sid);

alter table TreeviewConfig add constraint ref_entityUI_treeviewconfig foreign key (tvc_eu_sid)
      references EntityUI (eu_sid);

alter table TreeviewConfig add constraint ref_treeview_self foreign key (tvc_parent)
      references TreeviewConfig (tvc_sid);

alter table UIOperation add constraint ref_entityUI_uioperation foreign key (uo_eu_sid)
      references EntityUI (eu_sid);

alter table Users add constraint ref_org_user foreign key (usr_org)
      references Orgnization (org_sid);

alter table ViewService add constraint ref_app_viewsrv foreign key (vs_app_sid)
      references Application (app_sid);

alter table WorkflowComments add constraint ref_wfinstance_wfcomments foreign key (wfco_wfi_sid)
      references WorkflowInstance (wfi_sid);

alter table WorkflowConfig add constraint ref_app_wfconf foreign key (wfc_app_sid)
      references Application (app_sid);

alter table WorkflowConfig add constraint ref_entityconf_wfconf foreign key (wfc_entity)
      references EntityConfig (ec_sid);

alter table WorkflowInstance add constraint ref_wfconf_wfinstance foreign key (wfi_wfc_sid)
      references WorkflowConfig (wfc_sid);

alter table WorkflowNode add constraint ref_wfconf_wfnode foreign key (wfn_wfc_sid)
      references WorkflowConfig (wfc_sid);

alter table WorkflowOperation add constraint ref_wfconf_wfoperation foreign key (wfo_wfc_sid)
      references WorkflowConfig (wfc_sid);

alter table WorkflowOperation add constraint ref_wfoperation_desnode foreign key (wfo_des_node)
      references WorkflowNode (wfn_sid);

alter table WorkflowOperation add constraint ref_wfoperation_srcnode foreign key (wfo_src_node)
      references WorkflowNode (wfn_sid);

