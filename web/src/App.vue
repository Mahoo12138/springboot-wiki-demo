<template>
  <a-layout>
    <TheHeader/>
    <router-view/>
    <TheFooter/>
  </a-layout>
</template>
<script lang="ts">
import { UserOutlined, LaptopOutlined, NotificationOutlined } from '@ant-design/icons-vue';
import { defineComponent, ref } from 'vue';
import TheHeader from '@/components/TheHeader.vue'
import TheFooter from "@/components/TheFooter.vue";
export default defineComponent({
  components: {
    TheFooter,
    UserOutlined,
    LaptopOutlined,
    NotificationOutlined,
    TheHeader,
  },
  setup() {
    return {
      selectedKeys1: ref<string[]>(['2']),
      selectedKeys2: ref<string[]>(['1']),
      collapsed: ref<boolean>(false),
      openKeys: ref<string[]>(['sub1']),
    };
  },
});
</script>
<style>

</style>
