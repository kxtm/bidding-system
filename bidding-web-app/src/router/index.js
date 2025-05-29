import {createRouter, createWebHistory} from 'vue-router'

const router = createRouter({
    history: createWebHistory(import.meta.env.BASE_URL),
    routes: [
        {
            path: '/',
            component: () => import('@/components/Layout.vue'),
        },
        {
            path: '/login',
            name: 'login',
            component: () => import('@/views/LoginView.vue')
        },
        {
            path: '/about',
            component: () => import('@/components/Layout.vue'),
            children:[{
                path:"/about/index",
                component:()=>import('@/views/AboutView.vue')
            }]
        }
    ]
})

router.beforeEach((to, from, next) => {
    // if (to.path !== "/login") {
    //     router.push("/login").then(r => {
    //       console.log(from.fullPath)
    //     });
    // } else {
    //     next()
    // }
    next()

})
export default router
