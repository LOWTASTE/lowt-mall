<!-- 三级分类维护 -->
<template>
  <div>
    <el-tree
      :data="menus"
      :props="defaultProps"
      show-checkbox
      node-key="catId"
      :expand-on-click-node="false"
      :default-expanded-keys="expandedKey"
    >
      <span class="custom-tree-node" slot-scope="{ node, data }">
        <span>{{ node.label }}</span>
        <span>
          <el-button
            v-if="node.level <= 2"
            type="text"
            size="mini"
            @click="() => append(data)"
          >
            Append
          </el-button>
          <el-button
            v-if="node.childNodes.length == 0"
            type="text"
            size="mini"
            @click="() => remove(node, data)"
          >
            Delete
          </el-button>

          <el-button
            type="text"
            size="mini"
            @click="() => edit()"
          >
            Edit
          </el-button>
        </span>
      </span>
    </el-tree>

    <el-dialog :title="dialogTitle" :visible.sync="dialogVisible" width="50%">
      <el-form :model="category">
        <el-form-item label="分类名称" :label-width="formLabelWidth">
          <el-input v-model="category.name" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item label="分类名称" :label-width="formLabelWidth">
          <el-input v-model="category.name" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item label="分类名称" :label-width="formLabelWidth">
          <el-input v-model="category.name" autocomplete="off"></el-input>
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button @click="dialogFormVisible = false">取 消</el-button>
        <el-button type="primary" @click="addCategory">确 定</el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
export default {
  data() {
    return {
      dialogTitle: "",
      dialogType: "", // edit , add
      formLabelWidth: '120px',
      category: { name: "", parentCid: 0, catLevel: 0, showStatus: 1,sort: 0 },
      menus: [],
      expandedKey: [],
      dialogVisible: false,
      defaultProps: {
        children: `children`,
        label: `name`,
      },
    };
  },
  methods: {
    handleNodeClick(data) {
      console.log(data);
    },
    getMenus() {
      this.$http({
        url: this.$http.adornUrl("/lowtproduct/category/list/tree"),
        method: `get`,
      }).then(({ data }) => {
        console.log(`getMenus成功获取数据`, data);
        this.menus = data.categoryTree;
      });
    },
    getDataList() {
      this.dataListLoading = true;
      this.$http({
        url: this.$http.adornUrl("/lowtproduct/category/list/tree"),
        method: "get",
        params: this.$http.adornParams(),
      }).then(({ data }) => {
        this.dataListLoading = false;
        console.log(`getDataList成功获取数据`, data);
      });
    },
    append(data) {
      console.log(`append`), console.log(data);
      this.dialogTitle = "添加分类";
      this.dialogType = "add";
      this.category.parentCid = data.catId;
      this.category.catLevel = data.catLevel * 1 + 1;
      this.dialogVisible = true;
    },

    // 添加三级分类
    addCategory() {
      console.log(`提交的数据`, this.category);
      this.$http({
        url: this.$http.adornUrl("/lowtproduct/category/save"),
        method: "post",
        data: this.$http.adornData(this.category,false),
      }).then(({ data }) => {
        this.$message({
          message: "保存成功",
          type: "success"
        })
        this.dialogVisible = false;
        this.getMenus();
        this.expandedKey = [this.category.parentCid];
      });
    },

    remove(node, data) {
      var ids = [data.catId];

      this.$confirm(`是否删除${data.name}菜单？`, "提示", {
        confirmButtonText: "确定",
        cancelButtonText: "取消",
        type: "warning",
      })
        .then(() => {
          this.$http({
            url: this.$http.adornUrl("/lowtproduct/category/delete"),
            method: "post",
            data: this.$http.adornData(ids, false),
          }).then(({ data }) => {
            console.log("删除成功..."),
              this.$message({
                type: "success",
                message: "删除成功!",
              });
            // 更新
            this.getMenus();
            // 设置需要展开的菜单
            this.expandedKey = [node.parent.data.catId];
          });
        })
        .catch(() => {
          this.$message({
            type: "info",
            message: "已取消删除",
          });
        });
    },

    submitData(){
      if(this.dialogType == "add"){
          this.title = "添加分类"
          this.addCategory();
      } 
      if(this.dialogType == "edit"){
          this.title = "修改分类"
          this.editCategory();
      }
    },

    editCategory(){
      console.log(`Edit`);
      this.dialogType = "edit";
      this.dialogVisible = true;
    },

    edit(){
      this.dialogType = "edit";
      this.title = "修改分类";
      this.dialogVisible = true;
    }

  },
  activated() {
    // this.getDataList()
    this.getMenus();
  },
  created() {
    this.getDataList();
  },
};
</script>
