/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statistics;

import statistics.matcher.And;
import statistics.matcher.HasAtLeast;
import statistics.matcher.HasFewerThan;
import statistics.matcher.Matcher;
import statistics.matcher.Not;
import statistics.matcher.Or;
import statistics.matcher.PlaysIn;

/**
 *
 * @author Jonas
 */
public class QueryBuilder {
    Matcher matcher;

    public QueryBuilder() {
        alusta();
    }
    
    private void alusta() {
        matcher = new Matcher() {
            @Override
            public boolean matches(Player p) {
                return true;
            }
        };
    }
    QueryBuilder hasAtLeast(int value, String category) {
        matcher = new And(new HasAtLeast(value, category), matcher);
        return this;
    }

    QueryBuilder hasFewerThan(int value, String category) {
        matcher = new And(new HasFewerThan(value, category), matcher);
        return this;
    }

    QueryBuilder playsIn(String team) {
        matcher = new And(new PlaysIn(team), matcher);
        return this;
    }

    QueryBuilder not() {
        matcher = new Not(matcher);
        return this;
    }

    QueryBuilder oneOf(Matcher... matchers) {
        matcher = new Or(matchers);
        return this;
    }
    public Matcher build() {
        Matcher m = this.matcher;
        alusta();
        return m;
    }
}
