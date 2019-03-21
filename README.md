# WorldOfWarcraft
### 这个项目是一个简单的项目，用来实践java的包管理，实现和多态。
## 设计描述
暂略

## uml类图
![uml](https://raw.githubusercontent.com/zhaoyangyingmu/WorldOfWarcraft/master/uml_class.jpg)

## 学到的东西
* intellij自动画图
  + 右击->layout->organic layout，这个会好用很多。
  + 选中目标按c收缩，按e扩展。这样就不用每次手动添加一大堆类了。（tip: 先收缩在扩展）
* 包管理的思路是，将功能模块切开，而外部只会对模块产生少量的引用。
* Role和Profession的实现思路是依赖转置原则，其实也就是只使用接口，Profession的其他方法都不使用。
* Interface
  + 实现(implements)，需要实现抽象方法
  + 多态(polymorphism)，一般是对于使用者而言，对于使用者来说，他可以用所有的子类，避免以后的修改。
* 最后，这部分的代码全为Package，因为他们都是MVC中的model部分。
