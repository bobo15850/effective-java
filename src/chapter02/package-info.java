/**
 * @author 张波波
 *
 */
package chapter02;

// 创建和销毁对象

//一：静态工厂方法
// 1.用静态工厂代替构造器，优点是，不用全部都重载，可以有自己的易于理解的名称/可以用于建立单例模式，不用每次都新建一个实例/可以返回任意的子类对象
// 可以是的代码变得简洁，编译器自动做类型推导
// 2.静态工厂方法的缺点：如果不含有public 或者protected的构造方法就不能被子类化/与其他的静态方法没有本质的区别

// 二：构建器方法
// 1.如果一个类初始化的时候需要很多参数，构造方法和静态工厂方法都不好，用javaBean的方式setxxx类无法保持一致性，需要保证线程安全
// 2.可以采用构建器方法代替，具体代码参见 bean.java

//三：私有构造器或者枚举强化单例模式
// 1.单例模式的三种实现方式：私有构造方法+公有静态成员/私有构造方法+私有静态成员+公有静态工厂方法返回/单元素的枚举类型
// 2.为了防止通过反射机制AccessiableObject.setAccessible来调用私有构造方法需要在构造方法里限制创建第二个实例（以抛出异常的方式）
// 3.为了达到可序列化前两种方式不仅仅要implements
// Serializable还需要将实例域声明为瞬时（transient）并提供readResolve()方法。否则每次反序列化时会创建新的实例,单例模式的序列化要求高

// 四：通过私有构造函数使得类不可实例化
// 1.对于都是静态成员和静态方法的工具类不需要实例化也不希望其被实例化的时候可以提供一个显式的私有构造方法强制该类不能够在外部实例化
// 2.缺点：导致该类无法被子类化，因为子类在实例化的时候都要调用父类的构造器（无论显式的还是隐式的）但是私有构造函数的类没有构造器给子类调用
// 3.虽然抽象类也能实现该功能但是由于抽象类会让人以为该类就是要被子类化的，而且该类的子类也可以实例化

// 五：避免创建不必要的对象
// 1.重用不可变对象和已知不会被修改的可变对象
// 2.适配器模式下无需创建多个适配器实例
// 3.自动装箱：优先使用基本类型而不是装箱基本类型，当心无意识的自动装箱
// 4.维护对象池的代价很大，应谨慎使用，数据库连接池，网络连接池是比较典型的

// 六：消除过期的对象引用
// 1.java具有自动垃圾回收机制，但是也因此会带来隐式内存泄漏（无意识的对象保持）
// 2.会发生隐式内存泄漏的三种常见情形：
/*
 * A.类自己管理内存(一旦元素被释放该元素中包含的任何对象引用都应该被清除)。
 * B.缓存：可以使用weakHashMap(当除了自身对key的引用外，此key没有其他引用。
 * 此时map会自动丢弃此值)代替HashMap，还可以建立一个后台线程来随时清除无用的项。
 * ，linkedHashMap可以利用removeEldesEntry方法实现删除，也可以使用java.lang.ref来实现。 
 * C.监听器和其他回掉:使用weakHashMap
 */
// 3.使用Heap剖析工具（Heap Profiler）

// 七：避免使用终结方法（finalize()）
// 1.（暂时看不懂）