
/**
 * FirstWebServiceServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:20 GMT)
 */

    package wes;

    /**
     *  FirstWebServiceServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class FirstWebServiceServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public FirstWebServiceServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public FirstWebServiceServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for sellCurrency method
            * override this method for handling normal response from sellCurrency operation
            */
           public void receiveResultsellCurrency(
                    wes.FirstWebServiceServiceStub.SellCurrencyResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from sellCurrency operation
           */
            public void receiveErrorsellCurrency(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getCurrency method
            * override this method for handling normal response from getCurrency operation
            */
           public void receiveResultgetCurrency(
                    wes.FirstWebServiceServiceStub.GetCurrencyResponseE result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getCurrency operation
           */
            public void receiveErrorgetCurrency(java.lang.Exception e) {
            }
                


    }
    