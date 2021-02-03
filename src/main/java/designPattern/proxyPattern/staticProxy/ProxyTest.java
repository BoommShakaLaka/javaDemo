package designPattern.proxyPattern.staticProxy;

/**
 * 代理模式可以在不修改被代理对象的基础上，通过扩展代理类，进行一些功能的附加与增强。
 * 值得注意的是，代理类和被代理类应该共同实现一个接口，或者是共同继承某个类。
 */
public class ProxyTest {
    public static void main(String[] args) {

        RealMovie realmovie = new RealMovie();

        Movie movie = new Cinema(realmovie);
        movie.play();

//        Cinema cinema = new Cinema(realmovie);
//        cinema.play();
    }
}
