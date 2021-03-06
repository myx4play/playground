package sample.oracle.otn.soascheduler.proxy;

import java.io.File;

import java.net.MalformedURLException;
import java.net.URL;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (11.1.1.0.0, build 130224.1947.04102)

@WebServiceClient(wsdlLocation="http://myx-pc:8001/soa-infra/services/default/Project1/helloworld_client_ep?WSDL",
  targetNamespace="http://xmlns.oracle.com/HelloWorld/Project1/HelloWorld",
  name="helloworld_client_ep")
public class Helloworld_client_ep
  extends Service
{
  private static URL wsdlLocationURL;

  private static Logger logger;
  static
  {
    try
    {
      logger = Logger.getLogger("sample.oracle.otn.soascheduler.proxy.Helloworld_client_ep");
      URL baseUrl = Helloworld_client_ep.class.getResource(".");
      if (baseUrl == null)
      {
        wsdlLocationURL =
            Helloworld_client_ep.class.getResource("http://myx-pc:8001/soa-infra/services/default/Project1/helloworld_client_ep?WSDL");
        if (wsdlLocationURL == null)
        {
          baseUrl = new File(".").toURL();
          wsdlLocationURL =
              new URL(baseUrl, "http://myx-pc:8001/soa-infra/services/default/Project1/helloworld_client_ep?WSDL");
        }
      }
      else
      {
                if (!baseUrl.getPath().endsWith("/")) {
         baseUrl = new URL(baseUrl, baseUrl.getPath() + "/");
}
                wsdlLocationURL =
            new URL(baseUrl, "http://myx-pc:8001/soa-infra/services/default/Project1/helloworld_client_ep?WSDL");
      }
    }
    catch (MalformedURLException e)
    {
      logger.log(Level.ALL,
          "Failed to create wsdlLocationURL using http://myx-pc:8001/soa-infra/services/default/Project1/helloworld_client_ep?WSDL",
          e);
    }
  }

  public Helloworld_client_ep()
  {
    super(wsdlLocationURL,
          new QName("http://xmlns.oracle.com/HelloWorld/Project1/HelloWorld",
                    "helloworld_client_ep"));
  }

  public Helloworld_client_ep(URL wsdlLocation, QName serviceName)
  {
    super(wsdlLocation, serviceName);
  }

  @WebEndpoint(name="HelloWorld_pt")
  public sample.oracle.otn.soascheduler.proxy.HelloWorld getHelloWorld_pt()
  {
    return (sample.oracle.otn.soascheduler.proxy.HelloWorld) super.getPort(new QName("http://xmlns.oracle.com/HelloWorld/Project1/HelloWorld",
                                                                                     "HelloWorld_pt"),
                                                                           sample.oracle.otn.soascheduler.proxy.HelloWorld.class);
  }

  @WebEndpoint(name="HelloWorld_pt")
  public sample.oracle.otn.soascheduler.proxy.HelloWorld getHelloWorld_pt(WebServiceFeature... features)
  {
    return (sample.oracle.otn.soascheduler.proxy.HelloWorld) super.getPort(new QName("http://xmlns.oracle.com/HelloWorld/Project1/HelloWorld",
                                                                                     "HelloWorld_pt"),
                                                                           sample.oracle.otn.soascheduler.proxy.HelloWorld.class,
                                                                           features);
  }
}
