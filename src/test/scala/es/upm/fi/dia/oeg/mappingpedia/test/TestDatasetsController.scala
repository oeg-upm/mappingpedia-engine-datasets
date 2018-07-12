package es.upm.fi.dia.oeg.mappingpedia.test

import java.io.File

import es.upm.fi.dia.oeg.mappingpedia.controller.{DatasetController, DistributionController}
import es.upm.fi.dia.oeg.mappingpedia.model.{Agent, Dataset, Distribution, UnannotatedDistribution}

object TestDatasetsController {
  val organizationId = "test-mobileage-upm";
  val agent = new Agent(organizationId);
  val dataset = new Dataset(agent);
  val datasetController = DatasetController();

  def main(args:Array[String]) = {




    //this.testAddEmptyDataset(agent);
    this.testOneDistributionDataset(agent);

    //val distribution = new UnannotatedDistribution(dataset);
    //val distributionController = DistributionController();
    //this.testAddDistribution(distributionController, distribution);
    println("bye");
  }

  def testAddEmptyDataset() = {
    datasetController.add(
      dataset:Dataset
      , null
      , true
      , true
    );
  }

  def testOneDistributionDataset(agent:Agent) = {
    val distribution = new UnannotatedDistribution(dataset);
    val datasetController = DatasetController();
    datasetController.add(
      dataset:Dataset
      , null
      , true
      , true
    );
  }

  def testAddDistribution(distributionController: DistributionController
                          , distribution:Distribution) = {
    distributionController.addDistribution(
      distribution: Distribution
      , null
      , true
      , true
    )
  }


}