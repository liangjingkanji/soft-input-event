<p align="center"><strong>Android软键盘最佳解决方案</strong></p>

<p align="center"><a href="https://github.com/liangjingkanji/soft-input-event/releases/download/1.0.7/soft-input-event.apk">下载体验</a>
</p>

<p align="center">
<a href="https://jitpack.io/#liangjingkanji/soft-input-event"><img src="https://jitpack.io/v/liangjingkanji/soft-input-event.svg"/></a>
<img src="https://img.shields.io/badge/language-kotlin-orange.svg"/>
<img src="https://img.shields.io/badge/license-Apache-blue"/>
<a href="https://jq.qq.com/?_wv=1027&k=vWsXSNBJ"><img src="https://img.shields.io/badge/QQ群-752854893-blue"/></a>
</p>
<br>

<p align="center"><img src="https://user-images.githubusercontent.com/21078112/167005905-16698ff2-8893-47d7-85a2-7f1ed248ef63.gif" align="center" width="30%" /></p>

不同于其他同类型框架, 本框架使用Android11推出的新功能`WindowInsetsAnimation`来解决软键盘相关问题, 具备软键盘平滑过渡动画(部分机型可能不支持), 提供更准确的软键盘Api以及软键盘遮挡解决方案

<br>

如果遇到机型兼容问题请反馈或者发起修复PR

<p align="center"><strong>欢迎贡献代码/问题</strong></p>


## 特点

- [x] 软键盘显示隐藏使用平滑动画过渡
- [x] 指定视图悬浮于软键盘上
- [x] 更准确的软键盘高度/显示隐藏监听
- [x] 指定监听输入框
- [x] 显示/隐藏软键盘
- [x] 支持对话框
- [x] 更简单易用的方法

## 使用

监听键盘显示或者指定视图悬浮于软键盘上只需要一个方法

本方法支持`Activity/Fragment/Dialog/DialogFragment/BottomSheetDialogFragment`

```kotlin
setWindowSoftInput(
    float = llInput,
    onChanged = {
        Log.d("SoftInput", "visibility = ${hasSoftInput()}")
    }
)
```

| 方法                        | 描述                    |
| --------------------------- | ----------------------- |
| setWindowSoftInput          | 软键盘遮挡/监听显示隐藏 |
| showSoftInput/hideSoftInput | 显示隐藏软键盘          |
| hasSoftInput                | 当前是否有软键盘        |
| getSoftInputHeight          | 当前软键盘高度              |


## 安装

添加远程仓库根据创建项目的 Android Studio 版本有所不同

Android Studio Arctic Fox以下创建的项目 在项目根目录的 build.gradle 添加仓库

```groovy
allprojects {
    repositories {
        // ...
        maven { url 'https://jitpack.io' }
    }
}
```

Android Studio Arctic Fox以上创建的项目 在项目根目录的 settings.gradle 添加仓库

```kotlin
dependencyResolutionManagement {
    repositories {
        // ...
        maven { url 'https://jitpack.io' }
    }
}
```

然后在 module 的 build.gradle 添加依赖框架

```groovy
implementation 'com.github.liangjingkanji:soft-input-event:1.0.7'
```


## License

```
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
