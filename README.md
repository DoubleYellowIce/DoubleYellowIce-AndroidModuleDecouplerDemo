# 一个演示如何利用Dagger和interface来降低模块之间耦合度的demo
项目中有两个模块， moduleA和moduleB，它们互不依赖，但moduleA需要使用moduleB定义的ClassB类。

常见的做法是moduleA依赖moduleB来使用ClassB，但这样会增加moduleA和moduleB之间的耦合度，不利于后期的维护。

更合适的做法是：

新建一个baseModule，moduleA和moduleB都依赖baseModule。

baseModule里定义一个接口InterfaceB，moduleB的ClassB实现该接口。

通过Dagger将ClassB实例注入到moduleA的ModuleActivity里。

本demo演示的是用Dagger进行依赖注入，但用其它依赖注入库如Hilt也能达到同样的效果。

# A demo showcasing how to decouple modules using Dagger and interfaces

There are two modules in the project, moduleA and moduleB, which are independent of each other, but moduleA needs to use ClassB defined in moduleB.

The common practice is for moduleA to depend on moduleB to use ClassB, but this increases the coupling between moduleA and moduleB, making it difficult to maintain in the future.

A more appropriate approach is:

Create a new module named baseModule, and both moduleA and moduleB depend on baseModule.

Define an interface InterfaceB in baseModule, and ClassB in moduleB implements this interface.

Use Dagger to inject an instance of ClassB into ModuleActivity in moduleA.

This demo demonstrates how to perform dependency injection using Dagger, but other dependency injection libraries like Hilt can achieve the same decoupling effect.