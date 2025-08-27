# Android Basics with Compose - Learn Together

## 项目概述

本项目是跟随 Google
官方在线课程 [《Android Basics with Compose》](https://developer.android.com/courses/android-basics-compose/course)
完成的练习项目集合。课程介绍如何使用最新的最佳实践来构建 Android 应用，涵盖了使用 Jetpack Compose
构建应用的基础知识。项目中包含多个独立的 Android 练习应用，每个应用都展示了 Jetpack Compose 的不同方面和使用场景

## 核心知识点

### 1. Jetpack Compose 基础

- 使用 @Composable 函数构建声明式 UI
- 理解 Compose 的状态管理和重组机制
- 使用内置的 Compose 组件如 Column, Row, Text, Image 等

### 2. 布局和样式

- 创建复杂的布局结构，包括网格布局和列表
- 使用 Modifier 来控制组件的外观和行为
- 实现响应式设计和适配不同屏幕尺寸

### 3. 主题和 Material Design

- 自定义应用主题和样式
- 使用 Material Design 3 组件
- 实现一致的视觉设计语言

### 4. 状态管理

- 使用 mutableStateOf 和 remember 管理组件状态
- 理解状态提升和状态持有者模式
- 实现 ViewModel 与 Compose 的集成

### 5. 导航和路由

- 使用 Navigation Compose 实现屏幕间导航
- 处理返回栈和深层链接
- 实现条件导航和参数传递

### 6. 数据处理和存储

- 使用 Room 数据库进行本地数据存储
- 实现数据持久化和查询
- 处理异步数据操作

### 7. 后台任务和工作管理

- 使用 WorkManager 处理后台任务
- 实现图片处理等耗时操作
- 管理任务状态和进度更新

### 8. 网络请求和数据解析

- 使用 Retrofit 或其他网络库获取远程数据
- 解析 JSON 数据并显示在 UI 中
- 处理加载状态和错误情况

## 项目结构

```
.
├── ComposeQuadrant     # Compose 布局基础练习 (第3单元：显示列表并使用 Material Design)
├── DiceRoller          # 简单交互和状态管理 (第2单元：构建应用界面)
├── GreetingCard        # 基础 UI 组件使用 (第1单元：您的首个 Android 应用)
├── HappyBirthday       # 图片和文本组合显示 (第1单元：您的首个 Android 应用)
├── LearnTogether       # 教程介绍页面 (第1单元：您的首个 Android 应用)
├── TaskCompleted       # 完成状态展示界面 (第2单元：构建应用界面)
├── abusinessCard       # 个人名片设计 (第1单元：您的首个 Android 应用)
├── affirmations        # 正向激励应用 (第3单元：显示列表并使用 Material Design)
├── blurOMatic          # 图片模糊处理应用（WorkManager）(第7单元：WorkManager)
├── busSchedule         # 公交时刻表应用 (第6单元：数据持久性)
├── coursesapp          # 课程列表应用 (第5单元：连接到互联网)
├── cupcake             # 订单流程应用（导航）(第4单元：导航和应用架构)
├── dessertClicker      # 甜点点击游戏 (第4单元：导航和应用架构)
├── dessertRelease      # 甜点发布应用 (第4单元：导航和应用架构)
├── inventory           # 库存管理应用（完整 CRUD）(第6单元：数据持久性)
├── juiceTracker        # 饮品追踪应用 (第6单元：数据持久性)
├── lunchTray           # 午餐托盘订购系统 (第4单元：导航和应用架构)
├── marsPhotos          # 火星照片查看器（网络请求）(第5单元：连接到互联网)
├── reply               # 邮件回复应用（响应式布局）(第4单元：导航和应用架构)
├── sports              # 体育新闻应用 (第4单元：导航和应用架构)
├── superHeroes         # 超级英雄信息展示 (第3单元：显示列表并使用 Material Design)
├── unscramble          # 单词解谜游戏 (第2单元：构建应用界面)
├── waterMe             # 浇花提醒应用 (第7单元：WorkManager)
└── woof                # 宠物护理应用 (第3单元：显示列表并使用 Material Design)
```

## 技术亮点

1. **现代化架构**: 采用 MVVM 架构模式，分离 UI 和业务逻辑
2. **声明式 UI**: 全面使用 Jetpack Compose 构建用户界面
3. **状态驱动**: 正确管理应用状态，实现响应式 UI 更新
4. **组件化设计**: 模块化构建可重用的 UI 组件
5. **测试友好**: 设计易于测试的代码结构

## 学习资源

- [Android Basics with Compose 官方课程](https://developer.android.com/courses/android-basics-compose/course)
- [Jetpack Compose 使用入门](https://developer.android.com/develop/ui/compose/documentation)
- [Material Design 3 指南](https://m3.material.io/)

## 开发环境

建议详细查看[libs.versions.toml](gradle/libs.versions.toml)，运行出错时请考虑插件版本及配置问题。

## 使用说明

每个子项目都是一个独立的 Android 应用，可以直接在 Android Studio 中打开并运行。建议按课程进度顺序学习各个项目。