package com.ankur.creditcard.service;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.search.SearchType;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.stereotype.Service;

import com.ankur.creditcard.Utils.Utility;
import com.ankur.creditcard.model.CreditCard;

@Service
public class CreditCardServiceImpl implements CreditCardService {

	TransportClient transportClient;

	@SuppressWarnings("resource")
	public CreditCardServiceImpl() throws UnknownHostException {
		transportClient = new PreBuiltTransportClient(Settings.EMPTY)
				.addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("localhost"), 9300));
	}

	@Override
	public CreditCard findByName(String name) {

		SearchResponse res1 = transportClient.prepareSearch("creditcard").setTypes("credit_statement")
				.setSearchType(SearchType.DFS_QUERY_THEN_FETCH).setQuery(QueryBuilders.fuzzyQuery("Name", name)).get();

		GetResponse res = transportClient
				.prepareGet("creditcard", "credit_statement", Utility.findIdByName(res1.toString(), name)).get();

		return Utility.setEntity(res.getSource());
	}

	@Override
	public CreditCard findById(String id) {

		SearchResponse res1 = transportClient.prepareSearch("creditcard").setTypes("credit_statement")
				.setSearchType(SearchType.DFS_QUERY_THEN_FETCH).setQuery(QueryBuilders.fuzzyQuery("ID", id)).get();

		GetResponse res = transportClient.prepareGet("creditcard", "credit_statement", Utility.findId(res1.toString()))
				.get();

		return Utility.setEntity(res.getSource());
	}

}
