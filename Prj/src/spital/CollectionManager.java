package spital;

import java.util.*;

public class CollectionManager {

        public boolean findPersonByCnp(List<Person> personList, String cnp){
            //Parcurge lista de persoane;
            for(Person p:personList){
                //cautam cnp valid in lista
                if(p.getCnp().equals(cnp)){
                    return true;
                }
            }
            return false;
        }
        //cautare lista doctori

        public List<Doctor> extractDoctorList(List<Person>personList){
            List<Doctor> resultList=new ArrayList();
            for (Person p:personList){
                if(p instanceof Doctor) {
                    Doctor d = (Doctor) p;
                    resultList.add(d);
                }
            }
            return resultList;
        }
        //extrage lista de pacienti

        public List<Pacient> extractPacientLIst(List<Person>personList){
            List<Pacient> resultListPa=new ArrayList();
            for (Person p:personList){
                if(p instanceof Pacient){
                    Pacient pa=(Pacient) p;
                    resultListPa.add(pa);
                }
            }
            return resultListPa;
        }

        public int countDoctorBySpec(List<Doctor>doctorList, String specializare){
            int numarSpecialisti=0;
            for(Doctor d:doctorList){
                if(d.getSpecializare().equals(specializare)){
                    numarSpecialisti++;
                }
            }
            return numarSpecialisti;
        }

        //modificare cnp pacient dupa cnp
        public void modifyPacientByCnp(List<Pacient>pacientList, String cnp, String occupation){
            for(Pacient p3:pacientList){
                if(p3.getCnp().equals(cnp)){
                    p3.setOccupation(occupation);
                }
            }
        }

        //modificare adresa doctor dupa ID
        public void modifyDoctorAddressById(List<Doctor>doctorList, String city, int id){
            for(Doctor d4:doctorList){
                if(d4.getId()==id){
                    d4.setCity(city);
                }
            }
        }

        //adauga vizita medicala pacient dupa cnp
        public void addPacientMVisitByCnp(List<Pacient>pacientList, String cnp, MedicalVisit medicalVisit){
            for(Pacient p3:pacientList){
                if(p3.getCnp().equals(cnp)){
                    List<MedicalVisit> visits=p3.getMedicalVisit();
                    visits.add(medicalVisit);
                }
            }
        }
        //tipareste lista de Pacienti pt un doctor dupa cnp
        public List<Pacient> findPacientListOfDoctor(List<Pacient>pacientList, String cnp){
            List<Pacient> resultListP=new ArrayList();
            for (Pacient p6:pacientList){
                List<MedicalVisit> visits=p6.getVisits();
                for(MedicalVisit medicalVisit:visits){
                    Doctor d=medicalVisit.getDoctor();
                    if(d.getCnp().equals(cnp)){
                        resultListP.add(p6);
                    }
                }
            }
            return resultListP;
        }


        public boolean comparePacientLists(List<Pacient> list1, List<Pacient> list2){
            int size1=list1.size();
            int size2=list2.size();
            if (size1!=size2){
            return false;
            }
            int i=0;
            while (i<size1){
                Pacient p1=list1.get(i);
                Pacient p2=list2.get(i);
                if(!p1.equals(p2)){
                    return false;
                }
                i++;
            }
            return true;
        }


        public Set<String> filterDoctorList (List<Doctor>doctorList){
            Set<String> resultSet=new HashSet();
            for(Doctor d:doctorList){
                resultSet.add(d.getSpecializare());
            }
            return resultSet;
        }

        public Set<String> filterPacientList (List<Pacient>pacientList){
            Set<String> resultSet=new HashSet();
            for(Pacient p:pacientList){
                List<MedicalVisit> visits=p.getVisits();
                for(MedicalVisit medicalVisit:visits){
                    String diag=medicalVisit.getDiagnostic();
                    resultSet.add(diag);
                }
            }
            return resultSet;
        }

        //map pentru fiecare pacient numarul de visite medicale
        public Map<Pacient, Integer> filterPacientByNumberOfVisits(List<Pacient>pacientList){
            Map<Pacient, Integer> resultMap=new HashMap();
                for(Pacient p:pacientList){
                    List<MedicalVisit>visits=p.getVisits();
                    int nr=visits.size();
                    resultMap.put(p, nr);
                }
                return resultMap;
        }

        public Map<Doctor, List<Pacient>> filterPacientByDoctor(List<Doctor>doctorList, List<Pacient>pacientList){
            Map<Doctor, List<Pacient>> resultMap=new HashMap();
                for(Doctor d:doctorList){
                    List<Pacient> pacList=new ArrayList();
                    for(Pacient p:pacientList){
                        List<MedicalVisit> visits=p.getVisits();
                        for(MedicalVisit mv:visits){
                            Doctor doctor=mv.getDoctor();
                            if(d.equals(doctor)){
                                pacList.add(p);
                            }
                        }
                    }
                    resultMap.put(d,pacList);
                }
            return resultMap;
        }



    public Map<Doctor, Integer> filterDoctors(List<Doctor>doctorList, List<Pacient>pacientList){
            Map<Doctor, Integer> resultsMap=new HashMap();
                for(Doctor d:doctorList){
                    int nr=0;
                    for(Pacient p:pacientList){
                        List<MedicalVisit> visits=p.getVisits();
                        for(MedicalVisit mv:visits){
                            Doctor doctor=mv.getDoctor();
                            if(d.equals(doctor)){
                                nr++;
                            }
                        }
                    }
                    resultsMap.put(d, nr);
                }
            return resultsMap;
    }






}
