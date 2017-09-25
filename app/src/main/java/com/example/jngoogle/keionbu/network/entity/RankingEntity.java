package com.example.jngoogle.keionbu.network.entity;

/**
 * Created by jngoogle on 2017/2/23 19:25.
 * email: guyuanhaofan@cnicg.cn
 */

import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * 排行榜实体
 * songList:  歌曲列表
 * billboard: 榜单信息
 * errorCode: 错误码
 */
public class RankingEntity {
    @SerializedName("song_list")
    private List<SongList> songList;
    private Billboard billboard;
    @SerializedName("error_code")
    private String errorCode;

    public List<SongList> getSongList() {
        return songList;
    }

    public Billboard getBillboard() {
        return billboard;
    }

    public String getErrorCode() {
        return errorCode;
    }

    /**
     * 音乐榜单实体
     */

    public class Billboard {

        /**
         * billboard_type : 200
         * name : 原创音乐榜
         * pic_s192 : http://y.baidu.com/cms/app/192-192.jpg
         * pic_s210 : http://y.baidu.com/cms/app/210-210.jpg
         * pic_s260 : http://y.baidu.com/cms/app/260-260.jpg
         * pic_s444 : http://y.baidu.com/cms/app/444-444.jpg
         * pic_s640 : http://y.baidu.com/cms/app/640-640.jpg
         * pic_s238 : http://business.cdn.qianqian.com/qianqian/file/5746a2d18e954_287.jpg
         * web_url : http://y.baidu.com/top?play_top=top&pst=music_top
         */

        private int billboard_type;
        private String name;
        private String pic_s192;
        // 这四种尺寸的图常用
        private String pic_s210;
        private String pic_s260;
        private String pic_s444;
        private String pic_s640;

        private String pic_s238;
        private String web_url;

        public int getBillboard_type() {
            return billboard_type;
        }

        public String getName() {
            return name;
        }

        public String getPic_s192() {
            return pic_s192;
        }

        public String getPic_s210() {
            return pic_s210;
        }

        public String getPic_s260() {
            return pic_s260;
        }

        public String getPic_s444() {
            return pic_s444;
        }

        public String getPic_s640() {
            return pic_s640;
        }

        public String getPic_s238() {
            return pic_s238;
        }

        public String getWeb_url() {
            return web_url;
        }
    }

    public class SongList {

        /**
         * author : 容祖儿
         * all_artist_ting_uid : 1099
         * title : 最好时光
         * song_id : 243919722
         * del_status : 0
         * album_id : 522739401
         * pic_small : http://musicdata.baidu.com/data2/pic/522745919/e746ac48325db1e64c2ab6d70932eb63/522745919.jpg@s_0,w_90
         * resource_type : 0
         * all_artist_id : 128
         * artist_id : 128
         * high_rate : 320
         * is_charge : 1
         * all_rate : 64,128,256,320,flac
         * has_mv : 0
         * has_mv_mobile : 0
         * havehigh : 2
         * copy_type : 1
         * charge : 0
         * learn : 0
         * versions :
         * bitrate_fee : {"0":"129|-1","1":"-1|-1"}
         * ting_uid : 1099
         * album_title : 最好时光
         * is_first_publish : 0
         * song_source : web
         * piao_id : 0
         * korean_bb_song : 0
         * resource_type_ext : 0
         * mv_provider : 0000000000
         * artist_name : 容祖儿
         * rank : 5
         */

        private String author;
        private String all_artist_ting_uid;
        private String title;
        private String song_id;
        private String del_status;
        private String album_id;
        private String pic_small;
        private String resource_type;
        private String all_artist_id;
        private String artist_id;
        private String high_rate;
        private String is_charge;
        private String all_rate;
        private int has_mv;
        private int has_mv_mobile;
        private int havehigh;
        private String copy_type;
        private int charge;
        private int learn;
        private String versions;
        private String bitrate_fee;
        private String ting_uid;
        private String album_title;
        private int is_first_publish;
        private String song_source;
        private String piao_id;
        private String korean_bb_song;
        private String resource_type_ext;
        private String mv_provider;
        private String artist_name;
        private String rank;

        public String getAuthor() {
            return author;
        }


        public String getAll_artist_ting_uid() {
            return all_artist_ting_uid;
        }


        public String getTitle() {
            return title;
        }


        public String getSong_id() {
            return song_id;
        }


        public String getDel_status() {
            return del_status;
        }


        public String getAlbum_id() {
            return album_id;
        }


        public String getPic_small() {
            return pic_small;
        }


        public String getResource_type() {
            return resource_type;
        }


        public String getAll_artist_id() {
            return all_artist_id;
        }


        public String getArtist_id() {
            return artist_id;
        }


        public String getHigh_rate() {
            return high_rate;
        }


        public String getIs_charge() {
            return is_charge;
        }


        public String getAll_rate() {
            return all_rate;
        }


        public int getHas_mv() {
            return has_mv;
        }


        public int getHas_mv_mobile() {
            return has_mv_mobile;
        }


        public int getHavehigh() {
            return havehigh;
        }


        public String getCopy_type() {
            return copy_type;
        }


        public int getCharge() {
            return charge;
        }

        public void setCharge(int charge) {
            this.charge = charge;
        }

        public int getLearn() {
            return learn;
        }


        public String getVersions() {
            return versions;
        }


        public String getBitrate_fee() {
            return bitrate_fee;
        }


        public String getTing_uid() {
            return ting_uid;
        }


        public String getAlbum_title() {
            return album_title;
        }


        public int getIs_first_publish() {
            return is_first_publish;
        }


        public String getSong_source() {
            return song_source;
        }


        public String getPiao_id() {
            return piao_id;
        }

        public void setPiao_id(String piao_id) {
            this.piao_id = piao_id;
        }

        public String getKorean_bb_song() {
            return korean_bb_song;
        }


        public String getResource_type_ext() {
            return resource_type_ext;
        }


        public String getMv_provider() {
            return mv_provider;
        }


        public String getArtist_name() {
            return artist_name;
        }


        public String getRank() {
            return rank;
        }
    }


}
