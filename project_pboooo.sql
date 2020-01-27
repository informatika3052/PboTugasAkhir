/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     27/01/2020 22.01.31                          */
/*==============================================================*/


alter table Bimbingan 
   drop foreign key FK_BIMBINGA_ASSOCIATI_PERSETUJ;

alter table Bimbingan 
   drop foreign key FK_BIMBINGA_ASSOCIATI_DOSEN;

alter table HistoryJabatan 
   drop foreign key FK_HISTORYJ_ASSOCIATI_JABATAN;

alter table HistoryJabatan 
   drop foreign key FK_HISTORYJ_ASSOCIATI_DOSEN;

alter table JadwalKerjaPraktek 
   drop foreign key FK_JADWALKE_ASSOCIATI_PRODI;

alter table KerjaPraktek 
   drop foreign key FK_KERJAPRA_ASSOCIATI_JADWALKE;

alter table Mahasiswa 
   drop foreign key FK_MAHASISW_ASSOCIATI_KERJAPRA;

alter table Mahasiswa 
   drop foreign key FK_MAHASISW_ASSOCIATI_DOSEN;

alter table Mahasiswa 
   drop foreign key FK_MAHASISW_ASSOCIATI_PRODI;

alter table PersetujuanDosen 
   drop foreign key FK_PERSETUJ_ASSOCIATI_KERJAPRA;

alter table PersetujuanProdi 
   drop foreign key FK_PERSETUJ_ASSOCIATI_PRODI;

alter table PersetujuanProdi 
   drop foreign key FK_PERSETUJ_ASSOCIATI_PERSETUJ;


alter table Bimbingan 
   drop foreign key FK_BIMBINGA_ASSOCIATI_PERSETUJ;

alter table Bimbingan 
   drop foreign key FK_BIMBINGA_ASSOCIATI_DOSEN;

drop table if exists Bimbingan;

drop table if exists Dosen;


alter table HistoryJabatan 
   drop foreign key FK_HISTORYJ_ASSOCIATI_JABATAN;

alter table HistoryJabatan 
   drop foreign key FK_HISTORYJ_ASSOCIATI_DOSEN;

drop table if exists HistoryJabatan;

drop table if exists Jabatan;


alter table JadwalKerjaPraktek 
   drop foreign key FK_JADWALKE_ASSOCIATI_PRODI;

drop table if exists JadwalKerjaPraktek;


alter table KerjaPraktek 
   drop foreign key FK_KERJAPRA_ASSOCIATI_JADWALKE;

drop table if exists KerjaPraktek;


alter table Mahasiswa 
   drop foreign key FK_MAHASISW_ASSOCIATI_KERJAPRA;

alter table Mahasiswa 
   drop foreign key FK_MAHASISW_ASSOCIATI_PRODI;

alter table Mahasiswa 
   drop foreign key FK_MAHASISW_ASSOCIATI_DOSEN;

drop table if exists Mahasiswa;


alter table PersetujuanDosen 
   drop foreign key FK_PERSETUJ_ASSOCIATI_KERJAPRA;

drop table if exists PersetujuanDosen;


alter table PersetujuanProdi 
   drop foreign key FK_PERSETUJ_ASSOCIATI_PRODI;

alter table PersetujuanProdi 
   drop foreign key FK_PERSETUJ_ASSOCIATI_PERSETUJ;

drop table if exists PersetujuanProdi;

drop table if exists Prodi;

drop table if exists User;

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
/* Table: KerjaPraktek                                          */
/*==============================================================*/
create table KerjaPraktek
(
   idKp                 int not null auto_increment  comment '',
   idJadwal             int  comment '',
   namaKegiatan         varchar(254)  comment '',
   instansi             varchar(254)  comment '',
   primary key (idKp),
   constraint FK_KERJAPRA_ASSOCIATI_JADWALKE foreign key (idJadwal)
      references JadwalKerjaPraktek (idJadwal) on delete restrict on update restrict
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
   idAccDosen           int  comment '',
   idProdi              varchar(254)  comment '',
   accProdi             bool  comment '',
   primary key (idAccProdi),
   constraint FK_PERSETUJ_ASSOCIATI_PRODI foreign key (idProdi)
      references Prodi (idProdi) on delete restrict on update restrict,
   constraint FK_PERSETUJ_ASSOCIATI_PERSETUJ foreign key (idAccDosen)
      references PersetujuanDosen (idAccDosen) on delete restrict on update restrict
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
/* Table: Mahasiswa                                             */
/*==============================================================*/
create table Mahasiswa
(
   nim                  varchar(254) not null  comment '',
   idProdi              varchar(254)  comment '',
   nidn                 varchar(254)  comment '',
   idKp                 int  comment '',
   nama                 varchar(254)  comment '',
   nik                  varchar(254)  comment '',
   agama                varchar(254)  comment '',
   jenisKelamin         varchar(254)  comment '',
   email                varchar(254)  comment '',
   tanggalLahir         datetime  comment '',
   alamat               varchar(254)  comment '',
   primary key (nim),
   constraint FK_MAHASISW_ASSOCIATI_KERJAPRA foreign key (idKp)
      references KerjaPraktek (idKp) on delete restrict on update restrict,
   constraint FK_MAHASISW_ASSOCIATI_PRODI foreign key (idProdi)
      references Prodi (idProdi) on delete restrict on update restrict,
   constraint FK_MAHASISW_ASSOCIATI_DOSEN foreign key (nidn)
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

