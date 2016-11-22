# MVPdemo
MVP的一个demo，果然只有写过才知道效果
跟着简书上教程写的，下面要自己根据理解运用到实际应用中。
总结：
  1.Presenter 就像中间人似的，连接view和model；然后写对view调用的方法，调用model层的数据加载进来，然后view对不同情况进行处理；
  2.所以view层直接继承imainactivity接口，重写各种方法，直接可以调用到返回的数据，不管数据变成什么样子都是照常使用；
  3.model层主要写了对数据的操作，数据库，网络获取数据之类的，外面写了个接口callback 用来回调success和fail 状况->用到presenter中回调状态
  
  感觉应该写点Base类来增加可复用性，嘛，后面再说；
