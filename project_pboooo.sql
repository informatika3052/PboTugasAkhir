/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     Tue 28.01.20 00:41:34                        */
/*==============================================================*/


/*==============================================================*/
/* Table: Prodi                                                 */
/*==============================================================*/
create table Prodi
(
   idProdi              varchar(254) not null  comment '',
   namaProdi            varchar(254)  comment '',
   primary key (idProdi)
);

/*==============================================================*/
/* Table: JadwalKerjaPraktek                                    */
/*==============================================================*/
create table JadwalKerjaPraktek
(
   idJadwal             int not null auto_increment  comment '',
   idProdi              varchar(254)  comment '',
   mulai                datetime  comment '',
   akhir                datetime  comment '',
   primary key (idJadwal),
   constraint FK_JADWALKE_ASSOCIATI_PRODI foreign key (idProdi)
      references Prodi (idProdi) on delete restrict on update restrict
);

/*==============================================================*/
/* Table: Dosen                                                 */
/*==============================================================*/
create table Dosen
(
   nidn                 varchar(254) not null  comment '',
   nama                 varchar(254)  comment '',
   nik                  varchar(254)  comment '',
   agama                varchar(254)  comment '',
   jenisKelamin         varchar(254)  comment '',
   email                varchar(254)  comment '',
   tanggalLahir         datetime  comment '',
   alamat               varchar(254)  comment '',
   primary key (nidn)
);

/*==============================================================*/
/* Table: Mahasiswa                                             */
/*==============================================================*/
create table Mahasiswa
(
   nim                  varchar(254) not null  comment '',
   idProdi              varchar(254)  comment '',
   nidn                 varchar(254)  comment '',
   nama                 varchar(254)  comment '',
   nik                  varchar(254)  comment '',
   agama                varchar(254)  comment '',
   jenisKelamin         varchar(254)  comment '',
   email                varchar(254)  comment '',
   tanggalLahir         datetime  comment '',
   alamat               varchar(254)  comment '',
   primary key (nim),
   constraint FK_MAHASISW_ASSOCIATI_PRODI foreign key (idProdi)
      references Prodi (idProdi) on delete restrict on update restrict,
   constraint FK_MAHASISW_ASSOCIATI_DOSEN foreign key (nidn)
      references Dosen (nidn) on delete restrict on update restrict
);

/*==============================================================*/
/* Table: KerjaPraktek                                          */
/*==============================================================*/
create table KerjaPraktek
(
   idKp                 int not null auto_increment  comment '',
   nim                  varchar(254)  comment '',
   idJadwal             int  comment '',
   namaKegiatan         varchar(254)  comment '',
   instansi             varchar(254)  comment '',
   primary key (idKp),
   constraint FK_KERJAPRA_ASSOCIATI_JADWALKE foreign key (idJadwal)
      references JadwalKerjaPraktek (idJadwal) on delete restrict on update restrict,
   constraint FK_KERJAPRA_ASSOCIATI_MAHASISW foreign key (nim)
      references Mahasiswa (nim) on delete restrict on update restrict
);

/*==============================================================*/
/* Table: PersetujuanDosen                                      */
/*==============================================================*/
create table PersetujuanDosen
(
   idAccDosen           int not null auto_increment  comment '',
   idKp                 int  comment '',
   accDosen             bool  comment '',
   primary key (idAccDosen),
   constraint FK_PERSETUJ_ASSOCIATI_KERJAPRA foreign key (idKp)
      references KerjaPraktek (idKp) on delete restrict on update restrict
);

/*==============================================================*/
/* Table: PersetujuanProdi                                      */
/*==============================================================*/
create table PersetujuanProdi
(
   idAccProdi           int not null auto_increment  comment '',
   idProdi              varchar(254)  comment '',
   idAccDosen           int  comment '',
   accProdi             bool  comment '',
   primary key (idAccProdi),
   constraint FK_PERSETUJ_ASSOCIATI_PRODI foreign key (idProdi)
      references Prodi (idProdi) on delete restrict on update restrict,
   constraint FK_PERSETUJ_ASSOCIATI_PERSETUJ foreign key (idAccDosen)
      references PersetujuanDosen (idAccDosen) on delete restrict on update restrict
);

/*==============================================================*/
/* Table: Bimbingan                                             */
/*==============================================================*/
create table Bimbingan
(
   idBimbing            int not null auto_increment  comment '',
   idAccProdi           int  comment '',
   nidn                 varchar(254)  comment '',
   accPembimbing        varchar(254)  comment '',
   primary key (idBimbing),
   constraint FK_BIMBINGA_ASSOCIATI_PERSETUJ foreign key (idAccProdi)
      references PersetujuanProdi (idAccProdi) on delete restrict on update restrict,
   constraint FK_BIMBINGA_ASSOCIATI_DOSEN foreign key (nidn)
      references Dosen (nidn) on delete restrict on update restrict
);

/*==============================================================*/
/* Table: Jabatan                                               */
/*==============================================================*/
create table Jabatan
(
   idJabatan            int not null auto_increment  comment '',
   namaJabatan          varchar(254)  comment '',
   primary key (idJabatan)
);

/*==============================================================*/
/* Table: HistoryJabatan                                        */
/*==============================================================*/
create table HistoryJabatan
(
   idHistory            int not null auto_increment  comment '',
   idJabatan            int  comment '',
   nidn                 varchar(254)  comment '',
   startDate            datetime  comment '',
   tahunAjaran          varchar(254)  comment '',
   statusAktif          bool  comment '',
   primary key (idHistory),
   constraint FK_HISTORYJ_ASSOCIATI_JABATAN foreign key (idJabatan)
      references Jabatan (idJabatan) on delete restrict on update restrict,
   constraint FK_HISTORYJ_ASSOCIATI_DOSEN foreign key (nidn)
      references Dosen (nidn) on delete restrict on update restrict
);

/*==============================================================*/
/* Table: User                                                  */
/*==============================================================*/
create table User
(
   username             varchar(254) not null  comment '',
   password             varchar(254)  comment '',
   tipeUser             varchar(254)  comment '',
   primary key (username)
);

