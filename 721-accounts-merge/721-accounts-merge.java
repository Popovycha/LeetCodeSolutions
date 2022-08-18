class Solution {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        HashMap<String, List<String>> graph = new HashMap<>();

	for (List<String> account : accounts) {
		String key = account.get(1);
		graph.putIfAbsent(key, new ArrayList<>());
		for (int j=2; j<account.size(); j++) {
			String val = account.get(j);
			graph.get(key).add(val);
			graph.putIfAbsent(val, new ArrayList<>());
			graph.get(val).add(key);
		}
	}

	ArrayDeque<String> queue = new ArrayDeque<>();
	HashSet<String> visited = new HashSet<>();
	List<List<String>> ans = new ArrayList<>();

	for (List<String> account : accounts) {
		String name = account.get(0);
		String email = account.get(1);

		List<String> ls = new ArrayList<>();
		queue.add(email);

		while (!queue.isEmpty()) {
			String pop = queue.pollFirst();

			if (visited.contains(pop))
				continue;

			visited.add(pop);
			ls.add(pop);
			List<String> vals = graph.getOrDefault(pop, Collections.emptyList());

			for (String val : vals)
				queue.add(val);
		}

		if (!ls.isEmpty()) {
			Collections.sort(ls);
			List<String> emailsList = new ArrayList<>(ls);
			emailsList.add(0, name);
			ans.add(emailsList);
		}
	}

	return ans;
    }
}