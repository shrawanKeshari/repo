package com.test.thrift.ThriftService;

import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;

public class ThriftExecutor {
	
	TTransport transport;
	
	public TProtocol execute(String ip, int port) throws TTransportException {
		
		transport = new TSocket(ip, port);
		
		openConnection();
		
		TProtocol protocol = new  TBinaryProtocol(transport);
		
		return protocol;
	}
	
	public void closeConnection() {
		transport.close();
	}
	
	public void openConnection() throws TTransportException {
		transport.open();
	}
	
}
