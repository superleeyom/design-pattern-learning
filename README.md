## 三大分类
- **创建类**：[工厂方法模式（Factory）](https://github.com/superleeyom/design-pattern-learning/tree/master/src/main/java/com/leeyom/design/creation/factory/工厂方法模式.md)、[建造者模式（Builder）](https://github.com/superleeyom/design-pattern-learning/tree/master/src/main/java/com/leeyom/design/creation/builder/建造者模式.md)、[抽象工厂模式（Abstract Factory）](https://github.com/superleeyom/design-pattern-learning/tree/master/src/main/java/com/leeyom/design/creation/abstraction/抽象工厂模式.md)、[单例模式（Singleton）](https://github.com/superleeyom/design-pattern-learning/tree/master/src/main/java/com/leeyom/design/creation/singleton/单例模式.md)、[原型模式（Prototype）](https://github.com/superleeyom/design-pattern-learning/tree/master/src/main/java/com/leeyom/design/creation/prototype/原型模式.md)
- **结构类**：[适配器模式（Adapter）](https://github.com/superleeyom/design-pattern-learning/tree/master/src/main/java/com/leeyom/design/structure/adapter/适配器模式.md)、桥梁模式（Bridge）、组合模式（Composite）、装饰模式（Decorator）、门面模式（Facade）、享元模式（Flyweight）、[代理模式（Proxy）](https://github.com/superleeyom/design-pattern-learning/tree/master/src/main/java/com/leeyom/design/structure/proxy/代理模式.md)
- **行为类**：[责任链模式（Chain of Responsibility）](https://github.com/superleeyom/design-pattern-learning/tree/master/src/main/java/com/leeyom/design/behavior/chain/责任链模式.md)、[命令模式（Command）](https://github.com/superleeyom/design-pattern-learning/tree/master/src/main/java/com/leeyom/design/behavior/command/命令模式.md)、解释器模式（Interpreter）、迭代器模式（Iterator）、[中介者模式（Mediator）](https://github.com/superleeyom/design-pattern-learning/tree/master/src/main/java/com/leeyom/design/behavior/mediator/中介者模式.md)、备忘录模式（Memento）、观察者模式（Observer）、状态模式（State）、策略模式（Strategy）、[模板方法模式（Template Method）](https://github.com/superleeyom/design-pattern-learning/tree/master/src/main/java/com/leeyom/design/behavior/template/模板方法模式.md)、访问者模式（Visitor）

## 六大设计原则

### 单一职责原则
- 定义：**应该有且仅有一个原因引起类的变更，即一个类应该只有一个职责**。
- 单一职责原则有什么好处呢？
    - 类的复杂性降低，实现什么职责都有清晰明确的定义；
    - 可读性提高，复杂性降低，那当然可读性提高了；
    - 可维护性提高，可读性提高，那当然更容易维护了；
    - 变更引起的风险降低，变更是必不可少的，如果接口的单一职责做得好，一个接口修改只对相应的实现类有影响，对其他的接口无影响，这对系统的扩展性、维护性都有非常大的帮助。 
    
### 里氏替换原则
- 定义：**只要父类能出现的地方子类就可以出现，而且替换为子类也不会产生任何错误或异常，使用者可能根本就不需要知道是父类还是子类。但是，反过来就不行了，有子类出现的地方，父类未必就能适应**。
- 注意：如果子类不能完整地实现父类的方法，或者父类的某些方法在子类中已经发生“畸变”，则建议断开父子继承关系，采用依赖、聚集、组合等关系代替继承。

### 依赖倒置原则
- 定义：**高层模块不应该依赖低层模块，两者都应该依赖其抽象，抽象不应该依赖细节，细节应该依赖抽象**。
- 注意：在Java中，只要定义变量就必然要有类型，一个变量可以有两种类型：表面类型和实际类型，表面类型是在定义的时候赋予的类型，实际类型是对象的类型，如zhangSan的表面类型是IDriver，实际类型是Driver。

### 接口隔离原则
- 定义：**客户端不应该依赖它不需要的接口，类间的依赖关系应该建立在最小的接口上**。
- 具体到接口隔离原则就是，要求在接口中尽量少公布public方法，接口是对外的承诺，承诺越少对系统的开发越有利，变更的风险也就越少，同时也有利于降低成本。

### 迪米特法则
- 定义：**只与直接的朋友通信**。
- **一个对象应该对其他对象有最少的了解**。
- 通俗地讲，一个类应该对自己需要耦合或调用的类知道得最少，你（被耦合或调用的类）的内部是如何复杂都和我没关系，那是你的事情，我就知道你提供的这么多public方法，我就调用这么多，其他的我一概不关心。
- 注意：迪米特法则要求类“羞涩”一点，尽量不要对外公布太多的public方法和非静态的public变量，尽量内敛，多使用private、package-private、protected等访问权限。

### 开闭原则
- 定义：**一个软件实体如类、模块和函数应该对扩展开放，对修改关闭**。
- 通过接口或抽象类可以约束一组可能变化的行为，并且能够实现对扩展开放，其包含三层含义：第一，通过接口或抽象类约束扩展，对扩展进行边界限定，不允许出现在接口或抽象类中不存在的public方法；第二，参数类型、引用对象尽量使用接口或者抽象类，而不是实现类；第三，抽象层尽量保持稳定，一旦确定即不允许修改。
