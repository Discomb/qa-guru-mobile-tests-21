package guru.qa.config;

public interface Config extends org.aeonbits.owner.Config {



    @Key("browserstack.app")
    String getApp();

    @Key("browserstack.device")
    String getDevice();

    @Key("browserstack.os")
    String getOS();

    @Key("browserstack.project")
    String getProject();

    @Key("browserstack.build")
    String getBuild();

    @Key("browserstack.name")
    String getTestName();
}
