<template>
  <div>
    <title>PX Image Annotator</title>
    <Form ref="form" :rules="formValidate" :label-width="90" :model="form">
          <FormItem label="品种种" prop="kind">
            <Input v-model="form.kind" />
          </FormItem>
          <FormItem label="名字" prop="name">
            <Input v-model="form.name" />
          </FormItem>
          <FormItem label="颜色" prop="color">
            <Input v-model="form.color" />
          </FormItem>
          <FormItem label="图片链接" prop="imageUrl">
            <Input v-model="form.imageUrl" />
          </FormItem>
    </Form>
    <Row class="code-row-bg" justify="end" type="flex">
      <Button @click="cancel" style="margin-right:10px">取消</Button>
      <Button @click="save" type="primary">保存</Button>
    </Row>
  </div>
</template>
<script>

</script>
