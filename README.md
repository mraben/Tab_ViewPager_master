自定义TabLayout + ViewPgaer 样式

Step 1. AAdd it in your root build.gradle at the end of repositories:

allprojects {
    repositories {
	            ...
	            maven { url 'https://jitpack.io' }
    }
}
Step 2. Add the dependency

dependencies {
      implementation 'com.github.mraben:Tab_ViewPager_master:1.0.0'
}
