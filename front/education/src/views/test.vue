<template>
    <span>{{ test }}</span>
</template>

<script>
export default {
    // eslint-disable-next-line vue/multi-word-component-names
    name: "test",
    data() {
        return {
            test: ""
        }
    },
    methods: {
        testMethod() {
            this.$axios.get("http://localhost:8888/user/test").then((response) => {
                this.test = response.data
            }).catch((err) => {
                console.log("error" + err);
            });
        }
    },
    created() {
        this.testMethod()
    }
}
</script>