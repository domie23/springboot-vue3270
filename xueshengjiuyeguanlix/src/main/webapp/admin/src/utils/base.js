const base = {
    get() {
        return {
            url : "http://localhost:8080/xueshengjiuyeguanlix/",
            name: "xueshengjiuyeguanlix",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/xueshengjiuyeguanlix/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "学生就业管理系统"
        } 
    }
}
export default base
