
package com.integriks.smev.nwxRewrite.client.src.serverApi.autogenerated;

import javax.xml.ws.WebFault;
import com.integriks.smev.nwxRewrite.client.src.serverApi.autogenerated.types.basic.Void;


/**
 * 
 *                     Содержимое посылается через метод SendResponse,
 *                     но, согласно реестру типов запросов СМЭВ, содержательная часть сообщения
 *                     представляет из себя запрос или заявку, а не ответ.
 *                 
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6b21 
 * Generated source version: 2.0
 * 
 */
@WebFault(name = "IncorrectResponseContentType", targetNamespace = "urn://x-artefacts-smev-gov-ru/services/message-exchange/types/faults/1.1")
public class IncorrectResponseContentTypeException
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private Void faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public IncorrectResponseContentTypeException(String message, Void faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public IncorrectResponseContentTypeException(String message, Void faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.integriks.smev.nwxRewrite.client.src.serverApi.autogenerated.types.basic.Void
     */
    public Void getFaultInfo() {
        return faultInfo;
    }

}
