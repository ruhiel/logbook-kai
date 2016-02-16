package logbook.bean;

import java.util.HashMap;
import java.util.Map;

import logbook.internal.Config;

/**
 * 艦種のコレクション
 *
 */
public class StypeCollection {

    /** 艦種 */
    private Map<Integer, Stype> stypeMap = new HashMap<>();

    /**
     * 艦種を取得します。
     * @return 艦種
     */
    public Map<Integer, Stype> getStypeMap() {
        return this.stypeMap;
    }

    /**
     * 艦種を設定します。
     * @param stypeMap 艦種
     */
    public void setStypeMap(Map<Integer, Stype> stypeMap) {
        this.stypeMap = stypeMap;
    }

    /**
     * アプリケーションのデフォルト設定ディレクトリから{@link StypeCollection}を取得します、
     * これは次の記述と同等です
     * <blockquote>
     *     <code>Config.getDefault().get(StypeCollection.class)</code>
     * </blockquote>
     *
     * @return {@link StypeCollection}
     */
    public static StypeCollection get() {
        return Config.getDefault().get(StypeCollection.class);
    }
}